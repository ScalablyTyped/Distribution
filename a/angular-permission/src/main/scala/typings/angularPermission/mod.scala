package typings.angularPermission

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.IPromise
import typings.angularPermission.anon.Except
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object permission {
    
    @js.native
    trait DataWithPermissions extends StObject {
      
      var permissions: js.UndefOr[Except] = js.native
    }
    object DataWithPermissions {
      
      @scala.inline
      def apply(): DataWithPermissions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DataWithPermissions]
      }
      
      @scala.inline
      implicit class DataWithPermissionsMutableBuilder[Self <: DataWithPermissions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPermissions(value: Except): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
      }
    }
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IState * / any */ @js.native
    trait IPermissionState extends StObject {
      
      var data: js.UndefOr[js.Any | DataWithPermissions] = js.native
    }
    object IPermissionState {
      
      @scala.inline
      def apply(): IPermissionState = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IPermissionState]
      }
      
      @scala.inline
      implicit class IPermissionStateMutableBuilder[Self <: IPermissionState] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setData(value: js.Any | DataWithPermissions): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      }
    }
    
    @js.native
    trait Permission extends StObject {
      
      var permissionName: String = js.native
      
      def validatePermission(): IPromise[_] = js.native
      
      var validationFunction: js.UndefOr[PermissionValidationFunction] = js.native
    }
    object Permission {
      
      @scala.inline
      def apply(permissionName: String, validatePermission: () => IPromise[_]): Permission = {
        val __obj = js.Dynamic.literal(permissionName = permissionName.asInstanceOf[js.Any], validatePermission = js.Any.fromFunction0(validatePermission))
        __obj.asInstanceOf[Permission]
      }
      
      @scala.inline
      implicit class PermissionMutableBuilder[Self <: Permission] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPermissionName(value: String): Self = StObject.set(x, "permissionName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValidatePermission(value: () => IPromise[_]): Self = StObject.set(x, "validatePermission", js.Any.fromFunction0(value))
        
        @scala.inline
        def setValidationFunction(
          value: (/* permissionName */ js.UndefOr[String], /* transitionProperties */ js.UndefOr[TransitionProperties]) => Boolean | IPromise[js.Any]
        ): Self = StObject.set(x, "validationFunction", js.Any.fromFunction2(value))
        
        @scala.inline
        def setValidationFunctionUndefined: Self = StObject.set(x, "validationFunction", js.undefined)
      }
    }
    
    @js.native
    trait PermissionRedirectConfigation extends StObject {
      
      var options: js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateOptions */ js.Any
          ] = js.native
      
      var params: js.UndefOr[js.Object] = js.native
      
      var state: String = js.native
    }
    object PermissionRedirectConfigation {
      
      @scala.inline
      def apply(state: String): PermissionRedirectConfigation = {
        val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
        __obj.asInstanceOf[PermissionRedirectConfigation]
      }
      
      @scala.inline
      implicit class PermissionRedirectConfigationMutableBuilder[Self <: PermissionRedirectConfigation] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOptions(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateOptions */ js.Any
        ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
        
        @scala.inline
        def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
        
        @scala.inline
        def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait PermissionStore extends StObject {
      
      /**
        * Removes all permissions
        * @method
        */
      def clearStore(): Unit = js.native
      
      /**
        * Allows to define set of permissionNames with shared validation function on application configuration
        * @method
        * @throws {TypeError}
        *
        * @param permissionNames {Array} Set of permission names
        * @param validationFunction {Function} Function used to validate if permission is valid
        */
      def defineManyPermissions(permissionNames: js.Array[String], validationFunction: PermissionValidationFunction): Unit = js.native
      
      /**
        * Allows to define permission on application configuration
        * @method
        *
        * @param permissionName {String} Name of defined permission
        * @param validationFunction {Function} Function used to validate if permission is valid
        */
      def definePermission(permissionName: String, validationFunction: PermissionValidationFunction): Unit = js.native
      
      /**
        * Returns permission by it's name
        * @method
        *
        * @returns {permission.Permission} Permissions definition object
        */
      def getPermissionDefinition(permissionName: String): Permission = js.native
      
      /**
        * Returns all permissions
        * @method
        *
        * @returns {Object} Permissions collection
        */
      def getStore(): StringDictionary[Permission] = js.native
      
      /**
        * Checks if permission exists
        * @method
        *
        * @param permissionName {String} Name of defined permission
        * @returns {Boolean}
        */
      def hasPermissionDefinition(permissionName: String): Boolean = js.native
      
      /**
        * Deletes permission
        * @method
        *
        * @param permissionName {String} Name of defined permission
        */
      def removePermissionDefinition(permissionName: String): Unit = js.native
    }
    object PermissionStore {
      
      @scala.inline
      def apply(
        clearStore: () => Unit,
        defineManyPermissions: (js.Array[String], PermissionValidationFunction) => Unit,
        definePermission: (String, PermissionValidationFunction) => Unit,
        getPermissionDefinition: String => Permission,
        getStore: () => StringDictionary[Permission],
        hasPermissionDefinition: String => Boolean,
        removePermissionDefinition: String => Unit
      ): PermissionStore = {
        val __obj = js.Dynamic.literal(clearStore = js.Any.fromFunction0(clearStore), defineManyPermissions = js.Any.fromFunction2(defineManyPermissions), definePermission = js.Any.fromFunction2(definePermission), getPermissionDefinition = js.Any.fromFunction1(getPermissionDefinition), getStore = js.Any.fromFunction0(getStore), hasPermissionDefinition = js.Any.fromFunction1(hasPermissionDefinition), removePermissionDefinition = js.Any.fromFunction1(removePermissionDefinition))
        __obj.asInstanceOf[PermissionStore]
      }
      
      @scala.inline
      implicit class PermissionStoreMutableBuilder[Self <: PermissionStore] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClearStore(value: () => Unit): Self = StObject.set(x, "clearStore", js.Any.fromFunction0(value))
        
        @scala.inline
        def setDefineManyPermissions(value: (js.Array[String], PermissionValidationFunction) => Unit): Self = StObject.set(x, "defineManyPermissions", js.Any.fromFunction2(value))
        
        @scala.inline
        def setDefinePermission(value: (String, PermissionValidationFunction) => Unit): Self = StObject.set(x, "definePermission", js.Any.fromFunction2(value))
        
        @scala.inline
        def setGetPermissionDefinition(value: String => Permission): Self = StObject.set(x, "getPermissionDefinition", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetStore(value: () => StringDictionary[Permission]): Self = StObject.set(x, "getStore", js.Any.fromFunction0(value))
        
        @scala.inline
        def setHasPermissionDefinition(value: String => Boolean): Self = StObject.set(x, "hasPermissionDefinition", js.Any.fromFunction1(value))
        
        @scala.inline
        def setRemovePermissionDefinition(value: String => Unit): Self = StObject.set(x, "removePermissionDefinition", js.Any.fromFunction1(value))
      }
    }
    
    type PermissionValidationFunction = js.Function2[
        /* permissionName */ js.UndefOr[String], 
        /* transitionProperties */ js.UndefOr[TransitionProperties], 
        Boolean | IPromise[js.Any]
      ]
    
    @js.native
    trait Role extends StObject {
      
      var permissionNames: js.Array[String] = js.native
      
      var roleName: String = js.native
      
      def validateRole(): IPromise[_] = js.native
      
      var validationFunction: js.UndefOr[RoleValidationFunction] = js.native
    }
    object Role {
      
      @scala.inline
      def apply(permissionNames: js.Array[String], roleName: String, validateRole: () => IPromise[_]): Role = {
        val __obj = js.Dynamic.literal(permissionNames = permissionNames.asInstanceOf[js.Any], roleName = roleName.asInstanceOf[js.Any], validateRole = js.Any.fromFunction0(validateRole))
        __obj.asInstanceOf[Role]
      }
      
      @scala.inline
      implicit class RoleMutableBuilder[Self <: Role] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPermissionNames(value: js.Array[String]): Self = StObject.set(x, "permissionNames", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPermissionNamesVarargs(value: String*): Self = StObject.set(x, "permissionNames", js.Array(value :_*))
        
        @scala.inline
        def setRoleName(value: String): Self = StObject.set(x, "roleName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValidateRole(value: () => IPromise[_]): Self = StObject.set(x, "validateRole", js.Any.fromFunction0(value))
        
        @scala.inline
        def setValidationFunction(
          value: (/* roleName */ js.UndefOr[String], /* transitionProperties */ js.UndefOr[TransitionProperties]) => Boolean | IPromise[js.Any]
        ): Self = StObject.set(x, "validationFunction", js.Any.fromFunction2(value))
        
        @scala.inline
        def setValidationFunctionUndefined: Self = StObject.set(x, "validationFunction", js.undefined)
      }
    }
    
    @js.native
    trait RoleStore extends StObject {
      
      /**
        * Removes all role definitions
        * @method
        */
      def clearStore(): Unit = js.native
      
      /**
        * Allows to define role
        * @method
        *
        * @param roleName {String} Name of defined role
        * @param permissions {Array} Set of permission names
        */
      def defineRole(roleName: String, permissions: js.Array[String]): Unit = js.native
      /**
        * Allows to define role
        * @method
        *
        * @param roleName {String} Name of defined role
        * @param permissions {Array} Set of permission names
        * @param [validationFunction] {Function} Function used to validate if permissions in role are valid
        */
      def defineRole(roleName: String, permissions: js.Array[String], validationFunction: RoleValidationFunction): Unit = js.native
      
      /**
        * Returns role definition object by it's name
        * @method
        *
        * @returns {permission.Role} Role definition object
        */
      def getRoleDefinition(roleName: String): Role = js.native
      
      /**
        * Returns all role definitions
        * @method
        *
        * @returns {Object} Defined roles collection
        */
      def getStore(): StringDictionary[Role] = js.native
      
      /**
        * Checks if role is defined in store
        * @method
        *
        * @param roleName {String} Name of role
        * @returns {Boolean}
        */
      def hasRoleDefinition(roleName: String): Boolean = js.native
      
      /**
        * Deletes role from store
        * @method
        *
        * @param roleName {String} Name of defined permission
        */
      def removeRoleDefinition(roleName: String): Unit = js.native
    }
    
    type RoleValidationFunction = js.Function2[
        /* roleName */ js.UndefOr[String], 
        /* transitionProperties */ js.UndefOr[TransitionProperties], 
        Boolean | IPromise[js.Any]
      ]
    
    @js.native
    trait TransitionProperties extends StObject {
      
      var fromParams: js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateParamsService */ js.Any
          ] = js.native
      
      var fromState: js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IState */ js.Any
          ] = js.native
      
      var options: js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateOptions */ js.Any
          ] = js.native
      
      var toParams: js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateParamsService */ js.Any
          ] = js.native
      
      var toState: js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IState */ js.Any
          ] = js.native
    }
    object TransitionProperties {
      
      @scala.inline
      def apply(): TransitionProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TransitionProperties]
      }
      
      @scala.inline
      implicit class TransitionPropertiesMutableBuilder[Self <: TransitionProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFromParams(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateParamsService */ js.Any
        ): Self = StObject.set(x, "fromParams", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFromParamsUndefined: Self = StObject.set(x, "fromParams", js.undefined)
        
        @scala.inline
        def setFromState(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IState */ js.Any
        ): Self = StObject.set(x, "fromState", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFromStateUndefined: Self = StObject.set(x, "fromState", js.undefined)
        
        @scala.inline
        def setOptions(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateOptions */ js.Any
        ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
        
        @scala.inline
        def setToParams(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateParamsService */ js.Any
        ): Self = StObject.set(x, "toParams", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setToParamsUndefined: Self = StObject.set(x, "toParams", js.undefined)
        
        @scala.inline
        def setToState(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IState */ js.Any
        ): Self = StObject.set(x, "toState", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setToStateUndefined: Self = StObject.set(x, "toState", js.undefined)
      }
    }
  }
}

package typings.angularPermission

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.IPromise
import typings.angularPermission.anon.Except
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object angularMod {
  
  object permission {
    
    trait DataWithPermissions extends StObject {
      
      var permissions: js.UndefOr[Except] = js.undefined
    }
    object DataWithPermissions {
      
      inline def apply(): DataWithPermissions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DataWithPermissions]
      }
      
      extension [Self <: DataWithPermissions](x: Self) {
        
        inline def setPermissions(value: Except): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
        
        inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
      }
    }
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IState * / any */ trait IPermissionState extends StObject {
      
      var data: js.UndefOr[Any | DataWithPermissions] = js.undefined
    }
    object IPermissionState {
      
      inline def apply(): IPermissionState = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IPermissionState]
      }
      
      extension [Self <: IPermissionState](x: Self) {
        
        inline def setData(value: Any | DataWithPermissions): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      }
    }
    
    trait Permission extends StObject {
      
      var permissionName: String
      
      def validatePermission(): IPromise[Any]
      
      var validationFunction: js.UndefOr[PermissionValidationFunction] = js.undefined
    }
    object Permission {
      
      inline def apply(permissionName: String, validatePermission: () => IPromise[Any]): Permission = {
        val __obj = js.Dynamic.literal(permissionName = permissionName.asInstanceOf[js.Any], validatePermission = js.Any.fromFunction0(validatePermission))
        __obj.asInstanceOf[Permission]
      }
      
      extension [Self <: Permission](x: Self) {
        
        inline def setPermissionName(value: String): Self = StObject.set(x, "permissionName", value.asInstanceOf[js.Any])
        
        inline def setValidatePermission(value: () => IPromise[Any]): Self = StObject.set(x, "validatePermission", js.Any.fromFunction0(value))
        
        inline def setValidationFunction(
          value: (/* permissionName */ js.UndefOr[String], /* transitionProperties */ js.UndefOr[TransitionProperties]) => Boolean | IPromise[Any]
        ): Self = StObject.set(x, "validationFunction", js.Any.fromFunction2(value))
        
        inline def setValidationFunctionUndefined: Self = StObject.set(x, "validationFunction", js.undefined)
      }
    }
    
    trait PermissionRedirectConfigation extends StObject {
      
      var options: js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateOptions */ Any
          ] = js.undefined
      
      var params: js.UndefOr[js.Object] = js.undefined
      
      var state: String
    }
    object PermissionRedirectConfigation {
      
      inline def apply(state: String): PermissionRedirectConfigation = {
        val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
        __obj.asInstanceOf[PermissionRedirectConfigation]
      }
      
      extension [Self <: PermissionRedirectConfigation](x: Self) {
        
        inline def setOptions(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateOptions */ Any
        ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
        
        inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
        
        inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      }
    }
    
    trait PermissionStore extends StObject {
      
      /**
        * Removes all permissions
        * @method
        */
      def clearStore(): Unit
      
      /**
        * Allows to define set of permissionNames with shared validation function on application configuration
        * @method
        * @throws {TypeError}
        *
        * @param permissionNames {Array} Set of permission names
        * @param validationFunction {Function} Function used to validate if permission is valid
        */
      def defineManyPermissions(permissionNames: js.Array[String], validationFunction: PermissionValidationFunction): Unit
      
      /**
        * Allows to define permission on application configuration
        * @method
        *
        * @param permissionName {String} Name of defined permission
        * @param validationFunction {Function} Function used to validate if permission is valid
        */
      def definePermission(permissionName: String, validationFunction: PermissionValidationFunction): Unit
      
      /**
        * Returns permission by it's name
        * @method
        *
        * @returns {permission.Permission} Permissions definition object
        */
      def getPermissionDefinition(permissionName: String): Permission
      
      /**
        * Returns all permissions
        * @method
        *
        * @returns {Object} Permissions collection
        */
      def getStore(): StringDictionary[Permission]
      
      /**
        * Checks if permission exists
        * @method
        *
        * @param permissionName {String} Name of defined permission
        * @returns {Boolean}
        */
      def hasPermissionDefinition(permissionName: String): Boolean
      
      /**
        * Deletes permission
        * @method
        *
        * @param permissionName {String} Name of defined permission
        */
      def removePermissionDefinition(permissionName: String): Unit
    }
    object PermissionStore {
      
      inline def apply(
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
      
      extension [Self <: PermissionStore](x: Self) {
        
        inline def setClearStore(value: () => Unit): Self = StObject.set(x, "clearStore", js.Any.fromFunction0(value))
        
        inline def setDefineManyPermissions(value: (js.Array[String], PermissionValidationFunction) => Unit): Self = StObject.set(x, "defineManyPermissions", js.Any.fromFunction2(value))
        
        inline def setDefinePermission(value: (String, PermissionValidationFunction) => Unit): Self = StObject.set(x, "definePermission", js.Any.fromFunction2(value))
        
        inline def setGetPermissionDefinition(value: String => Permission): Self = StObject.set(x, "getPermissionDefinition", js.Any.fromFunction1(value))
        
        inline def setGetStore(value: () => StringDictionary[Permission]): Self = StObject.set(x, "getStore", js.Any.fromFunction0(value))
        
        inline def setHasPermissionDefinition(value: String => Boolean): Self = StObject.set(x, "hasPermissionDefinition", js.Any.fromFunction1(value))
        
        inline def setRemovePermissionDefinition(value: String => Unit): Self = StObject.set(x, "removePermissionDefinition", js.Any.fromFunction1(value))
      }
    }
    
    type PermissionValidationFunction = js.Function2[
        /* permissionName */ js.UndefOr[String], 
        /* transitionProperties */ js.UndefOr[TransitionProperties], 
        Boolean | IPromise[Any]
      ]
    
    trait Role extends StObject {
      
      var permissionNames: js.Array[String]
      
      var roleName: String
      
      def validateRole(): IPromise[Any]
      
      var validationFunction: js.UndefOr[RoleValidationFunction] = js.undefined
    }
    object Role {
      
      inline def apply(permissionNames: js.Array[String], roleName: String, validateRole: () => IPromise[Any]): Role = {
        val __obj = js.Dynamic.literal(permissionNames = permissionNames.asInstanceOf[js.Any], roleName = roleName.asInstanceOf[js.Any], validateRole = js.Any.fromFunction0(validateRole))
        __obj.asInstanceOf[Role]
      }
      
      extension [Self <: Role](x: Self) {
        
        inline def setPermissionNames(value: js.Array[String]): Self = StObject.set(x, "permissionNames", value.asInstanceOf[js.Any])
        
        inline def setPermissionNamesVarargs(value: String*): Self = StObject.set(x, "permissionNames", js.Array(value*))
        
        inline def setRoleName(value: String): Self = StObject.set(x, "roleName", value.asInstanceOf[js.Any])
        
        inline def setValidateRole(value: () => IPromise[Any]): Self = StObject.set(x, "validateRole", js.Any.fromFunction0(value))
        
        inline def setValidationFunction(
          value: (/* roleName */ js.UndefOr[String], /* transitionProperties */ js.UndefOr[TransitionProperties]) => Boolean | IPromise[Any]
        ): Self = StObject.set(x, "validationFunction", js.Any.fromFunction2(value))
        
        inline def setValidationFunctionUndefined: Self = StObject.set(x, "validationFunction", js.undefined)
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
        Boolean | IPromise[Any]
      ]
    
    trait TransitionProperties extends StObject {
      
      var fromParams: js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateParamsService */ Any
          ] = js.undefined
      
      var fromState: js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IState */ Any
          ] = js.undefined
      
      var options: js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateOptions */ Any
          ] = js.undefined
      
      var toParams: js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateParamsService */ Any
          ] = js.undefined
      
      var toState: js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IState */ Any
          ] = js.undefined
    }
    object TransitionProperties {
      
      inline def apply(): TransitionProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TransitionProperties]
      }
      
      extension [Self <: TransitionProperties](x: Self) {
        
        inline def setFromParams(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateParamsService */ Any
        ): Self = StObject.set(x, "fromParams", value.asInstanceOf[js.Any])
        
        inline def setFromParamsUndefined: Self = StObject.set(x, "fromParams", js.undefined)
        
        inline def setFromState(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IState */ Any
        ): Self = StObject.set(x, "fromState", value.asInstanceOf[js.Any])
        
        inline def setFromStateUndefined: Self = StObject.set(x, "fromState", js.undefined)
        
        inline def setOptions(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateOptions */ Any
        ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
        
        inline def setToParams(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateParamsService */ Any
        ): Self = StObject.set(x, "toParams", value.asInstanceOf[js.Any])
        
        inline def setToParamsUndefined: Self = StObject.set(x, "toParams", js.undefined)
        
        inline def setToState(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IState */ Any
        ): Self = StObject.set(x, "toState", value.asInstanceOf[js.Any])
        
        inline def setToStateUndefined: Self = StObject.set(x, "toState", js.undefined)
      }
    }
  }
}

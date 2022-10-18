package typings.adobePdfservicesNodeSdk

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationOptionProtectpdfPermissionsMod {
  
  @JSImport("@adobe/pdfservices-node-sdk/operation/option/protectpdf/permissions", "Permissions")
  @js.native
  open class Permissions () extends StObject {
    
    var _permissionsSet: Set[Any] = js.native
    
    /**
      * Adds a document [Permission]{@link PasswordProtectOptions.Permission} in the permissions set.
      */
    def addPermission(permission: Any): Unit = js.native
    
    /**
      * Returns the intended set of document permissions values.
      */
    def getValues(): Set[Any] = js.native
    
    def validate(permission: Any): Unit = js.native
  }
  /* static members */
  object Permissions {
    
    @JSImport("@adobe/pdfservices-node-sdk/operation/option/protectpdf/permissions", "Permissions")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new {@link Permissions} instance.
      *
      * @return a {@link Permissions} instance
      */
    inline def createNew(): Permissions = ^.asInstanceOf[js.Dynamic].applyDynamic("createNew")().asInstanceOf[Permissions]
  }
}

package typings.activexLibreoffice.com_.sun.star.deployment

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes version clashes of a deployment unit.
  *
  * This exception is intended to be used with an {@link com.sun.star.task.XInteractionHandler} .
  * @since OOo 2.1
  */
trait VersionException
  extends StObject
     with Exception {
  
  /**
    * represents the already installed version of the deployment unit.
    *
    * Must not be `NULL` .
    */
  var Deployed: XPackage
  
  /** the display name of the extension which is being installed. */
  var NewDisplayName: String
  
  /** the version of the extension which is being installed. */
  var NewVersion: String
}
object VersionException {
  
  inline def apply(
    Context: XInterface,
    Deployed: XPackage,
    Message: String,
    NewDisplayName: String,
    NewVersion: String
  ): VersionException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Deployed = Deployed.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], NewDisplayName = NewDisplayName.asInstanceOf[js.Any], NewVersion = NewVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionException]
  }
  
  extension [Self <: VersionException](x: Self) {
    
    inline def setDeployed(value: XPackage): Self = StObject.set(x, "Deployed", value.asInstanceOf[js.Any])
    
    inline def setNewDisplayName(value: String): Self = StObject.set(x, "NewDisplayName", value.asInstanceOf[js.Any])
    
    inline def setNewVersion(value: String): Self = StObject.set(x, "NewVersion", value.asInstanceOf[js.Any])
  }
}

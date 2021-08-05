package typings.activexLibreoffice.com_.sun.star.embed

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes a verb. */
trait VerbDescriptor extends StObject {
  
  /**
    * specifies the attributes of the verb.
    *
    * It can take values from {@link VerbAttributes} .
    */
  var VerbAttributes: Double
  
  /**
    * specifies the flags that are set for the verb.
    *
    * The flags can be used to build the verb's menu.
    */
  var VerbFlags: Double
  
  /** specifies the id of the verb. */
  var VerbID: Double
  
  /** specifies the name of the verb. */
  var VerbName: String
}
object VerbDescriptor {
  
  inline def apply(VerbAttributes: Double, VerbFlags: Double, VerbID: Double, VerbName: String): VerbDescriptor = {
    val __obj = js.Dynamic.literal(VerbAttributes = VerbAttributes.asInstanceOf[js.Any], VerbFlags = VerbFlags.asInstanceOf[js.Any], VerbID = VerbID.asInstanceOf[js.Any], VerbName = VerbName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerbDescriptor]
  }
  
  extension [Self <: VerbDescriptor](x: Self) {
    
    inline def setVerbAttributes(value: Double): Self = StObject.set(x, "VerbAttributes", value.asInstanceOf[js.Any])
    
    inline def setVerbFlags(value: Double): Self = StObject.set(x, "VerbFlags", value.asInstanceOf[js.Any])
    
    inline def setVerbID(value: Double): Self = StObject.set(x, "VerbID", value.asInstanceOf[js.Any])
    
    inline def setVerbName(value: String): Self = StObject.set(x, "VerbName", value.asInstanceOf[js.Any])
  }
}

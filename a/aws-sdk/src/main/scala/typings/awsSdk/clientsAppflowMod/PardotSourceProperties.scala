package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PardotSourceProperties extends StObject {
  
  /**
    * The object specified in the Salesforce Pardot flow source.
    */
  var `object`: Object
}
object PardotSourceProperties {
  
  inline def apply(`object`: Object): PardotSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PardotSourceProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PardotSourceProperties] (val x: Self) extends AnyVal {
    
    inline def setObject(value: Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}

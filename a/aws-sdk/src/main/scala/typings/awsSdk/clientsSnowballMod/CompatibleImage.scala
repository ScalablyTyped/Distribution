package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompatibleImage extends StObject {
  
  /**
    * The unique identifier for an individual Snow device AMI.
    */
  var AmiId: js.UndefOr[String] = js.undefined
  
  /**
    * The optional name of a compatible image.
    */
  var Name: js.UndefOr[String] = js.undefined
}
object CompatibleImage {
  
  inline def apply(): CompatibleImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompatibleImage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompatibleImage] (val x: Self) extends AnyVal {
    
    inline def setAmiId(value: String): Self = StObject.set(x, "AmiId", value.asInstanceOf[js.Any])
    
    inline def setAmiIdUndefined: Self = StObject.set(x, "AmiId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}

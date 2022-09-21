package typings.activexVbide.VBIDE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddIn extends StObject {
  
  def Collection(index: Any): AddIn
  @JSName("Collection")
  val Collection_Original: Addins
  
  var Connect: Boolean
  
  var Description: String
  
  val Guid: String
  
  var Object: Any
  
  val ProgId: String
  
  val VBE: typings.activexVbide.VBIDE.VBE
  
  /* private */ @JSName("VBIDE.AddIn_typekey")
  var VBIDEDotAddIn_typekey: AddIn
}
object AddIn {
  
  inline def apply(
    Collection: Addins,
    Connect: Boolean,
    Description: String,
    Guid: String,
    Object: Any,
    ProgId: String,
    VBE: VBE,
    VBIDEDotAddIn_typekey: AddIn
  ): AddIn = {
    val __obj = js.Dynamic.literal(Collection = Collection.asInstanceOf[js.Any], Connect = Connect.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Guid = Guid.asInstanceOf[js.Any], Object = Object.asInstanceOf[js.Any], ProgId = ProgId.asInstanceOf[js.Any], VBE = VBE.asInstanceOf[js.Any])
    __obj.updateDynamic("VBIDE.AddIn_typekey")(VBIDEDotAddIn_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddIn]
  }
  
  extension [Self <: AddIn](x: Self) {
    
    inline def setCollection(value: Addins): Self = StObject.set(x, "Collection", value.asInstanceOf[js.Any])
    
    inline def setConnect(value: Boolean): Self = StObject.set(x, "Connect", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setGuid(value: String): Self = StObject.set(x, "Guid", value.asInstanceOf[js.Any])
    
    inline def setObject(value: Any): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
    
    inline def setProgId(value: String): Self = StObject.set(x, "ProgId", value.asInstanceOf[js.Any])
    
    inline def setVBE(value: VBE): Self = StObject.set(x, "VBE", value.asInstanceOf[js.Any])
    
    inline def setVBIDEDotAddIn_typekey(value: AddIn): Self = StObject.set(x, "VBIDE.AddIn_typekey", value.asInstanceOf[js.Any])
  }
}

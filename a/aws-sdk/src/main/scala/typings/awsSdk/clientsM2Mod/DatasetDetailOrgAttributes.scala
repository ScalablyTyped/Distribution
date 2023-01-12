package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetDetailOrgAttributes extends StObject {
  
  /**
    * The generation data group of the data set.
    */
  var gdg: js.UndefOr[GdgDetailAttributes] = js.undefined
  
  /**
    * The details of a VSAM data set.
    */
  var vsam: js.UndefOr[VsamDetailAttributes] = js.undefined
}
object DatasetDetailOrgAttributes {
  
  inline def apply(): DatasetDetailOrgAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetDetailOrgAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatasetDetailOrgAttributes] (val x: Self) extends AnyVal {
    
    inline def setGdg(value: GdgDetailAttributes): Self = StObject.set(x, "gdg", value.asInstanceOf[js.Any])
    
    inline def setGdgUndefined: Self = StObject.set(x, "gdg", js.undefined)
    
    inline def setVsam(value: VsamDetailAttributes): Self = StObject.set(x, "vsam", value.asInstanceOf[js.Any])
    
    inline def setVsamUndefined: Self = StObject.set(x, "vsam", js.undefined)
  }
}

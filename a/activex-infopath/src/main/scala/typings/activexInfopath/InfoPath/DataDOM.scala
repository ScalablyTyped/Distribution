package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataDOM extends StObject {
  
  /* private */ @JSName("InfoPath.DataDOM_typekey")
  var InfoPathDotDataDOM_typekey: DataDOM
}
object DataDOM {
  
  inline def apply(InfoPathDotDataDOM_typekey: DataDOM): DataDOM = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("InfoPath.DataDOM_typekey")(InfoPathDotDataDOM_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataDOM]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataDOM] (val x: Self) extends AnyVal {
    
    inline def setInfoPathDotDataDOM_typekey(value: DataDOM): Self = StObject.set(x, "InfoPath.DataDOM_typekey", value.asInstanceOf[js.Any])
  }
}

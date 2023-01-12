package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputParameterCollection extends StObject {
  
  val Count: Double
  
  /* private */ @JSName("InfoPath.InputParameterCollection_typekey")
  var InfoPathDotInputParameterCollection_typekey: InputParameterCollection
  
  def Item(varIndex: Any): InputParameterObject
}
object InputParameterCollection {
  
  inline def apply(
    Count: Double,
    InfoPathDotInputParameterCollection_typekey: InputParameterCollection,
    Item: Any => InputParameterObject
  ): InputParameterCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.InputParameterCollection_typekey")(InfoPathDotInputParameterCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputParameterCollection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputParameterCollection] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setInfoPathDotInputParameterCollection_typekey(value: InputParameterCollection): Self = StObject.set(x, "InfoPath.InputParameterCollection_typekey", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => InputParameterObject): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}

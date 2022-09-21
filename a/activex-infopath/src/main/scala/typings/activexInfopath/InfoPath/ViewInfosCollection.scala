package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewInfosCollection extends StObject {
  
  val Count: Double
  
  /* private */ @JSName("InfoPath.ViewInfosCollection_typekey")
  var InfoPathDotViewInfosCollection_typekey: ViewInfosCollection
  
  def Item(varIndex: Any): ViewInfoObject
}
object ViewInfosCollection {
  
  inline def apply(
    Count: Double,
    InfoPathDotViewInfosCollection_typekey: ViewInfosCollection,
    Item: Any => ViewInfoObject
  ): ViewInfosCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.ViewInfosCollection_typekey")(InfoPathDotViewInfosCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewInfosCollection]
  }
  
  extension [Self <: ViewInfosCollection](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setInfoPathDotViewInfosCollection_typekey(value: ViewInfosCollection): Self = StObject.set(x, "InfoPath.ViewInfosCollection_typekey", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => ViewInfoObject): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}

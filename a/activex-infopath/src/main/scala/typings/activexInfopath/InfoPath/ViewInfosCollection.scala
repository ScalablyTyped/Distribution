package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewInfosCollection extends StObject {
  
  val Count: Double = js.native
  
  @JSName("InfoPath.ViewInfosCollection_typekey")
  var InfoPathDotViewInfosCollection_typekey: ViewInfosCollection = js.native
  
  def Item(varIndex: js.Any): ViewInfoObject = js.native
}
object ViewInfosCollection {
  
  @scala.inline
  def apply(
    Count: Double,
    InfoPathDotViewInfosCollection_typekey: ViewInfosCollection,
    Item: js.Any => ViewInfoObject
  ): ViewInfosCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.ViewInfosCollection_typekey")(InfoPathDotViewInfosCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewInfosCollection]
  }
  
  @scala.inline
  implicit class ViewInfosCollectionMutableBuilder[Self <: ViewInfosCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotViewInfosCollection_typekey(value: ViewInfosCollection): Self = StObject.set(x, "InfoPath.ViewInfosCollection_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => ViewInfoObject): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}

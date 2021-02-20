package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataAdaptersCollection extends StObject {
  
  val Count: Double = js.native
  
  @JSName("InfoPath.DataAdaptersCollection_typekey")
  var InfoPathDotDataAdaptersCollection_typekey: DataAdaptersCollection = js.native
  
  def Item(varIndex: js.Any): js.Any = js.native
}
object DataAdaptersCollection {
  
  @scala.inline
  def apply(
    Count: Double,
    InfoPathDotDataAdaptersCollection_typekey: DataAdaptersCollection,
    Item: js.Any => js.Any
  ): DataAdaptersCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.DataAdaptersCollection_typekey")(InfoPathDotDataAdaptersCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataAdaptersCollection]
  }
  
  @scala.inline
  implicit class DataAdaptersCollectionMutableBuilder[Self <: DataAdaptersCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotDataAdaptersCollection_typekey(value: DataAdaptersCollection): Self = StObject.set(x, "InfoPath.DataAdaptersCollection_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => js.Any): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}

package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataObjectsCollection extends StObject {
  
  val Count: Double
  
  @JSName("InfoPath.DataObjectsCollection_typekey")
  var InfoPathDotDataObjectsCollection_typekey: DataObjectsCollection
  
  def Item(varIndex: js.Any): DataSourceObject
}
object DataObjectsCollection {
  
  @scala.inline
  def apply(
    Count: Double,
    InfoPathDotDataObjectsCollection_typekey: DataObjectsCollection,
    Item: js.Any => DataSourceObject
  ): DataObjectsCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.DataObjectsCollection_typekey")(InfoPathDotDataObjectsCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObjectsCollection]
  }
  
  @scala.inline
  implicit class DataObjectsCollectionMutableBuilder[Self <: DataObjectsCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotDataObjectsCollection_typekey(value: DataObjectsCollection): Self = StObject.set(x, "InfoPath.DataObjectsCollection_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => DataSourceObject): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}

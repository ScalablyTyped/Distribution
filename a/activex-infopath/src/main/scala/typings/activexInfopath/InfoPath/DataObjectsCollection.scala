package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataObjectsCollection extends StObject {
  
  val Count: Double
  
  /* private */ @JSName("InfoPath.DataObjectsCollection_typekey")
  var InfoPathDotDataObjectsCollection_typekey: DataObjectsCollection
  
  def Item(varIndex: Any): DataSourceObject
}
object DataObjectsCollection {
  
  inline def apply(
    Count: Double,
    InfoPathDotDataObjectsCollection_typekey: DataObjectsCollection,
    Item: Any => DataSourceObject
  ): DataObjectsCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.DataObjectsCollection_typekey")(InfoPathDotDataObjectsCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObjectsCollection]
  }
  
  extension [Self <: DataObjectsCollection](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setInfoPathDotDataObjectsCollection_typekey(value: DataObjectsCollection): Self = StObject.set(x, "InfoPath.DataObjectsCollection_typekey", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => DataSourceObject): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}

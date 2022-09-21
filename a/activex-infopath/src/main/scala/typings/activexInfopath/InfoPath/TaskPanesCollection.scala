package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskPanesCollection extends StObject {
  
  val Count: Double
  
  /* private */ @JSName("InfoPath.TaskPanesCollection_typekey")
  var InfoPathDotTaskPanesCollection_typekey: TaskPanesCollection
  
  def Item(varIndex: Any): TaskPaneObject
}
object TaskPanesCollection {
  
  inline def apply(
    Count: Double,
    InfoPathDotTaskPanesCollection_typekey: TaskPanesCollection,
    Item: Any => TaskPaneObject
  ): TaskPanesCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.TaskPanesCollection_typekey")(InfoPathDotTaskPanesCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskPanesCollection]
  }
  
  extension [Self <: TaskPanesCollection](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setInfoPathDotTaskPanesCollection_typekey(value: TaskPanesCollection): Self = StObject.set(x, "InfoPath.TaskPanesCollection_typekey", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => TaskPaneObject): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}

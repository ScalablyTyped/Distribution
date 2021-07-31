package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskPanesCollection extends StObject {
  
  val Count: Double
  
  @JSName("InfoPath.TaskPanesCollection_typekey")
  var InfoPathDotTaskPanesCollection_typekey: TaskPanesCollection
  
  def Item(varIndex: js.Any): TaskPaneObject
}
object TaskPanesCollection {
  
  @scala.inline
  def apply(
    Count: Double,
    InfoPathDotTaskPanesCollection_typekey: TaskPanesCollection,
    Item: js.Any => TaskPaneObject
  ): TaskPanesCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.TaskPanesCollection_typekey")(InfoPathDotTaskPanesCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskPanesCollection]
  }
  
  @scala.inline
  implicit class TaskPanesCollectionMutableBuilder[Self <: TaskPanesCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotTaskPanesCollection_typekey(value: TaskPanesCollection): Self = StObject.set(x, "InfoPath.TaskPanesCollection_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => TaskPaneObject): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}

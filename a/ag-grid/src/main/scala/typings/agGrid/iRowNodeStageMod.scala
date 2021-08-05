package typings.agGrid

import org.scalablytyped.runtime.StringDictionary
import typings.agGrid.changedPathMod.ChangedPath
import typings.agGrid.clientSideRowModelMod.RowNodeTransaction
import typings.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iRowNodeStageMod {
  
  trait IRowNodeStage extends StObject {
    
    def execute(params: StageExecuteParams): js.Any
  }
  object IRowNodeStage {
    
    inline def apply(execute: StageExecuteParams => js.Any): IRowNodeStage = {
      val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute))
      __obj.asInstanceOf[IRowNodeStage]
    }
    
    extension [Self <: IRowNodeStage](x: Self) {
      
      inline def setExecute(value: StageExecuteParams => js.Any): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    }
  }
  
  trait StageExecuteParams extends StObject {
    
    var changedPath: js.UndefOr[ChangedPath] = js.undefined
    
    var rowNode: RowNode
    
    var rowNodeOrder: js.UndefOr[StringDictionary[Double]] = js.undefined
    
    var rowNodeTransaction: js.UndefOr[RowNodeTransaction] = js.undefined
  }
  object StageExecuteParams {
    
    inline def apply(rowNode: RowNode): StageExecuteParams = {
      val __obj = js.Dynamic.literal(rowNode = rowNode.asInstanceOf[js.Any])
      __obj.asInstanceOf[StageExecuteParams]
    }
    
    extension [Self <: StageExecuteParams](x: Self) {
      
      inline def setChangedPath(value: ChangedPath): Self = StObject.set(x, "changedPath", value.asInstanceOf[js.Any])
      
      inline def setChangedPathUndefined: Self = StObject.set(x, "changedPath", js.undefined)
      
      inline def setRowNode(value: RowNode): Self = StObject.set(x, "rowNode", value.asInstanceOf[js.Any])
      
      inline def setRowNodeOrder(value: StringDictionary[Double]): Self = StObject.set(x, "rowNodeOrder", value.asInstanceOf[js.Any])
      
      inline def setRowNodeOrderUndefined: Self = StObject.set(x, "rowNodeOrder", js.undefined)
      
      inline def setRowNodeTransaction(value: RowNodeTransaction): Self = StObject.set(x, "rowNodeTransaction", value.asInstanceOf[js.Any])
      
      inline def setRowNodeTransactionUndefined: Self = StObject.set(x, "rowNodeTransaction", js.undefined)
    }
  }
}

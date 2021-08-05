package typings.activexMsforms.MSForms

import typings.activexMsforms.activexMsformsStrings.Action
import typings.activexMsforms.activexMsformsStrings.ActionX
import typings.activexMsforms.activexMsformsStrings.ActionY
import typings.activexMsforms.activexMsformsStrings.ActualDx
import typings.activexMsforms.activexMsformsStrings.ActualDy
import typings.activexMsforms.activexMsformsStrings.Cancel
import typings.activexMsforms.activexMsformsStrings.CancelDisplay
import typings.activexMsforms.activexMsformsStrings.Data
import typings.activexMsforms.activexMsformsStrings.Description
import typings.activexMsforms.activexMsformsStrings.DragState
import typings.activexMsforms.activexMsformsStrings.Effect
import typings.activexMsforms.activexMsformsStrings.HelpContext
import typings.activexMsforms.activexMsformsStrings.HelpFile
import typings.activexMsforms.activexMsformsStrings.Index
import typings.activexMsforms.activexMsformsStrings.Number
import typings.activexMsforms.activexMsformsStrings.RequestDx
import typings.activexMsforms.activexMsformsStrings.RequestDy
import typings.activexMsforms.activexMsformsStrings.SCode
import typings.activexMsforms.activexMsformsStrings.Shift
import typings.activexMsforms.activexMsformsStrings.Source
import typings.activexMsforms.activexMsformsStrings.State
import typings.activexMsforms.activexMsformsStrings.X
import typings.activexMsforms.activexMsformsStrings.Y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EventHelperTypes {
  
  type ContainerBeforeDragOverArgNames = js.Tuple8[Cancel, typings.activexMsforms.activexMsformsStrings.Control, Data, X, Y, State, Effect, Shift]
  
  trait ContainerBeforeDragOverParameter extends StObject {
    
    val Cancel: ReturnBoolean
    
    val Control: typings.activexMsforms.MSForms.Control
    
    val Data: DataObject
    
    val Effect: ReturnEffect
    
    val Shift: Double
    
    val State: fmDragState
    
    val X: Double
    
    val Y: Double
  }
  object ContainerBeforeDragOverParameter {
    
    inline def apply(
      Cancel: ReturnBoolean,
      Control: Control,
      Data: DataObject,
      Effect: ReturnEffect,
      Shift: Double,
      State: fmDragState,
      X: Double,
      Y: Double
    ): ContainerBeforeDragOverParameter = {
      val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Control = Control.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], Effect = Effect.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainerBeforeDragOverParameter]
    }
    
    extension [Self <: ContainerBeforeDragOverParameter](x: Self) {
      
      inline def setCancel(value: ReturnBoolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
      
      inline def setControl(value: Control): Self = StObject.set(x, "Control", value.asInstanceOf[js.Any])
      
      inline def setData(value: DataObject): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setEffect(value: ReturnEffect): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
      
      inline def setShift(value: Double): Self = StObject.set(x, "Shift", value.asInstanceOf[js.Any])
      
      inline def setState(value: fmDragState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
    }
  }
  
  type ContainerBeforeDropOrPasteArgNames = js.Tuple8[
    Cancel, 
    typings.activexMsforms.activexMsformsStrings.Control, 
    Action, 
    Data, 
    X, 
    Y, 
    Effect, 
    Shift
  ]
  
  trait ContainerBeforeDropOrPasteParameter extends StObject {
    
    val Action: fmAction
    
    val Cancel: ReturnBoolean
    
    val Control: typings.activexMsforms.MSForms.Control
    
    val Data: DataObject
    
    val Effect: ReturnEffect
    
    val Shift: Double
    
    val X: Double
    
    val Y: Double
  }
  object ContainerBeforeDropOrPasteParameter {
    
    inline def apply(
      Action: fmAction,
      Cancel: ReturnBoolean,
      Control: Control,
      Data: DataObject,
      Effect: ReturnEffect,
      Shift: Double,
      X: Double,
      Y: Double
    ): ContainerBeforeDropOrPasteParameter = {
      val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Cancel = Cancel.asInstanceOf[js.Any], Control = Control.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], Effect = Effect.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainerBeforeDropOrPasteParameter]
    }
    
    extension [Self <: ContainerBeforeDropOrPasteParameter](x: Self) {
      
      inline def setAction(value: fmAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
      
      inline def setCancel(value: ReturnBoolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
      
      inline def setControl(value: Control): Self = StObject.set(x, "Control", value.asInstanceOf[js.Any])
      
      inline def setData(value: DataObject): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setEffect(value: ReturnEffect): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
      
      inline def setShift(value: Double): Self = StObject.set(x, "Shift", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
    }
  }
  
  type ContainerScrollArgNames = js.Tuple6[ActionX, ActionY, RequestDx, RequestDy, ActualDx, ActualDy]
  
  trait ContainerScrollParameter extends StObject {
    
    val ActionX: fmScrollAction
    
    val ActionY: fmScrollAction
    
    val ActualDx: ReturnSingle
    
    val ActualDy: ReturnSingle
    
    val RequestDx: Double
    
    val RequestDy: Double
  }
  object ContainerScrollParameter {
    
    inline def apply(
      ActionX: fmScrollAction,
      ActionY: fmScrollAction,
      ActualDx: ReturnSingle,
      ActualDy: ReturnSingle,
      RequestDx: Double,
      RequestDy: Double
    ): ContainerScrollParameter = {
      val __obj = js.Dynamic.literal(ActionX = ActionX.asInstanceOf[js.Any], ActionY = ActionY.asInstanceOf[js.Any], ActualDx = ActualDx.asInstanceOf[js.Any], ActualDy = ActualDy.asInstanceOf[js.Any], RequestDx = RequestDx.asInstanceOf[js.Any], RequestDy = RequestDy.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainerScrollParameter]
    }
    
    extension [Self <: ContainerScrollParameter](x: Self) {
      
      inline def setActionX(value: fmScrollAction): Self = StObject.set(x, "ActionX", value.asInstanceOf[js.Any])
      
      inline def setActionY(value: fmScrollAction): Self = StObject.set(x, "ActionY", value.asInstanceOf[js.Any])
      
      inline def setActualDx(value: ReturnSingle): Self = StObject.set(x, "ActualDx", value.asInstanceOf[js.Any])
      
      inline def setActualDy(value: ReturnSingle): Self = StObject.set(x, "ActualDy", value.asInstanceOf[js.Any])
      
      inline def setRequestDx(value: Double): Self = StObject.set(x, "RequestDx", value.asInstanceOf[js.Any])
      
      inline def setRequestDy(value: Double): Self = StObject.set(x, "RequestDy", value.asInstanceOf[js.Any])
    }
  }
  
  type ControlBeforeDragOverArgNames = js.Tuple7[Cancel, Data, X, Y, DragState, Effect, Shift]
  
  trait ControlBeforeDragOverParameter extends StObject {
    
    val Cancel: ReturnBoolean
    
    val Data: DataObject
    
    val DragState: fmDragState
    
    val Effect: ReturnEffect
    
    val Shift: Double
    
    val X: Double
    
    val Y: Double
  }
  object ControlBeforeDragOverParameter {
    
    inline def apply(
      Cancel: ReturnBoolean,
      Data: DataObject,
      DragState: fmDragState,
      Effect: ReturnEffect,
      Shift: Double,
      X: Double,
      Y: Double
    ): ControlBeforeDragOverParameter = {
      val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], DragState = DragState.asInstanceOf[js.Any], Effect = Effect.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlBeforeDragOverParameter]
    }
    
    extension [Self <: ControlBeforeDragOverParameter](x: Self) {
      
      inline def setCancel(value: ReturnBoolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
      
      inline def setData(value: DataObject): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setDragState(value: fmDragState): Self = StObject.set(x, "DragState", value.asInstanceOf[js.Any])
      
      inline def setEffect(value: ReturnEffect): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
      
      inline def setShift(value: Double): Self = StObject.set(x, "Shift", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
    }
  }
  
  type ControlBeforeDropOrPasteArgNames = js.Tuple7[Cancel, Action, Data, X, Y, Effect, Shift]
  
  trait ControlBeforeDropOrPasteParameter extends StObject {
    
    val Action: fmAction
    
    val Cancel: ReturnBoolean
    
    val Data: DataObject
    
    val Effect: ReturnEffect
    
    val Shift: Double
    
    val X: Double
    
    val Y: Double
  }
  object ControlBeforeDropOrPasteParameter {
    
    inline def apply(
      Action: fmAction,
      Cancel: ReturnBoolean,
      Data: DataObject,
      Effect: ReturnEffect,
      Shift: Double,
      X: Double,
      Y: Double
    ): ControlBeforeDropOrPasteParameter = {
      val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Cancel = Cancel.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], Effect = Effect.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlBeforeDropOrPasteParameter]
    }
    
    extension [Self <: ControlBeforeDropOrPasteParameter](x: Self) {
      
      inline def setAction(value: fmAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
      
      inline def setCancel(value: ReturnBoolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
      
      inline def setData(value: DataObject): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setEffect(value: ReturnEffect): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
      
      inline def setShift(value: Double): Self = StObject.set(x, "Shift", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
    }
  }
  
  type ErrorArgNames = js.Tuple7[Number, Description, SCode, Source, HelpFile, HelpContext, CancelDisplay]
  
  trait ErrorParameter extends StObject {
    
    val CancelDisplay: ReturnBoolean
    
    val Description: ReturnString
    
    val HelpContext: Double
    
    val HelpFile: String
    
    val Number: Double
    
    val SCode: Double
    
    val Source: String
  }
  object ErrorParameter {
    
    inline def apply(
      CancelDisplay: ReturnBoolean,
      Description: ReturnString,
      HelpContext: Double,
      HelpFile: String,
      Number: Double,
      SCode: Double,
      Source: String
    ): ErrorParameter = {
      val __obj = js.Dynamic.literal(CancelDisplay = CancelDisplay.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], HelpContext = HelpContext.asInstanceOf[js.Any], HelpFile = HelpFile.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any], SCode = SCode.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorParameter]
    }
    
    extension [Self <: ErrorParameter](x: Self) {
      
      inline def setCancelDisplay(value: ReturnBoolean): Self = StObject.set(x, "CancelDisplay", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: ReturnString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      inline def setHelpContext(value: Double): Self = StObject.set(x, "HelpContext", value.asInstanceOf[js.Any])
      
      inline def setHelpFile(value: String): Self = StObject.set(x, "HelpFile", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Double): Self = StObject.set(x, "Number", value.asInstanceOf[js.Any])
      
      inline def setSCode(value: Double): Self = StObject.set(x, "SCode", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    }
  }
  
  type MultiPageBeforeDragOverArgNames = js.Tuple9[
    Index, 
    Cancel, 
    typings.activexMsforms.activexMsformsStrings.Control, 
    Data, 
    X, 
    Y, 
    State, 
    Effect, 
    Shift
  ]
  
  trait MultiPageBeforeDragOverParameter extends StObject {
    
    val Cancel: ReturnBoolean
    
    val Control: typings.activexMsforms.MSForms.Control
    
    val Data: DataObject
    
    val Effect: ReturnEffect
    
    val Index: Double
    
    val Shift: Double
    
    val State: fmDragState
    
    val X: Double
    
    val Y: Double
  }
  object MultiPageBeforeDragOverParameter {
    
    inline def apply(
      Cancel: ReturnBoolean,
      Control: Control,
      Data: DataObject,
      Effect: ReturnEffect,
      Index: Double,
      Shift: Double,
      State: fmDragState,
      X: Double,
      Y: Double
    ): MultiPageBeforeDragOverParameter = {
      val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Control = Control.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], Effect = Effect.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiPageBeforeDragOverParameter]
    }
    
    extension [Self <: MultiPageBeforeDragOverParameter](x: Self) {
      
      inline def setCancel(value: ReturnBoolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
      
      inline def setControl(value: Control): Self = StObject.set(x, "Control", value.asInstanceOf[js.Any])
      
      inline def setData(value: DataObject): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setEffect(value: ReturnEffect): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
      
      inline def setShift(value: Double): Self = StObject.set(x, "Shift", value.asInstanceOf[js.Any])
      
      inline def setState(value: fmDragState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
    }
  }
  
  type MultiPageBeforeDropOrPasteArgNames = js.Tuple9[
    Index, 
    Cancel, 
    typings.activexMsforms.activexMsformsStrings.Control, 
    Action, 
    Data, 
    X, 
    Y, 
    Effect, 
    Shift
  ]
  
  trait MultiPageBeforeDropOrPasteParameter extends StObject {
    
    val Action: fmAction
    
    val Cancel: ReturnBoolean
    
    val Control: typings.activexMsforms.MSForms.Control
    
    val Data: DataObject
    
    val Effect: ReturnEffect
    
    val Index: Double
    
    val Shift: Double
    
    val X: Double
    
    val Y: Double
  }
  object MultiPageBeforeDropOrPasteParameter {
    
    inline def apply(
      Action: fmAction,
      Cancel: ReturnBoolean,
      Control: Control,
      Data: DataObject,
      Effect: ReturnEffect,
      Index: Double,
      Shift: Double,
      X: Double,
      Y: Double
    ): MultiPageBeforeDropOrPasteParameter = {
      val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Cancel = Cancel.asInstanceOf[js.Any], Control = Control.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], Effect = Effect.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiPageBeforeDropOrPasteParameter]
    }
    
    extension [Self <: MultiPageBeforeDropOrPasteParameter](x: Self) {
      
      inline def setAction(value: fmAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
      
      inline def setCancel(value: ReturnBoolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
      
      inline def setControl(value: Control): Self = StObject.set(x, "Control", value.asInstanceOf[js.Any])
      
      inline def setData(value: DataObject): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setEffect(value: ReturnEffect): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
      
      inline def setShift(value: Double): Self = StObject.set(x, "Shift", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
    }
  }
  
  type MultiPageErrorArgNames = js.Tuple8[Index, Number, Description, SCode, Source, HelpFile, HelpContext, CancelDisplay]
  
  trait MultiPageErrorParameter extends StObject {
    
    val CancelDisplay: ReturnBoolean
    
    val Description: ReturnString
    
    val HelpContext: Double
    
    val HelpFile: String
    
    val Index: Double
    
    val Number: Double
    
    val SCode: Double
    
    val Source: String
  }
  object MultiPageErrorParameter {
    
    inline def apply(
      CancelDisplay: ReturnBoolean,
      Description: ReturnString,
      HelpContext: Double,
      HelpFile: String,
      Index: Double,
      Number: Double,
      SCode: Double,
      Source: String
    ): MultiPageErrorParameter = {
      val __obj = js.Dynamic.literal(CancelDisplay = CancelDisplay.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], HelpContext = HelpContext.asInstanceOf[js.Any], HelpFile = HelpFile.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any], SCode = SCode.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiPageErrorParameter]
    }
    
    extension [Self <: MultiPageErrorParameter](x: Self) {
      
      inline def setCancelDisplay(value: ReturnBoolean): Self = StObject.set(x, "CancelDisplay", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: ReturnString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      inline def setHelpContext(value: Double): Self = StObject.set(x, "HelpContext", value.asInstanceOf[js.Any])
      
      inline def setHelpFile(value: String): Self = StObject.set(x, "HelpFile", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Double): Self = StObject.set(x, "Number", value.asInstanceOf[js.Any])
      
      inline def setSCode(value: Double): Self = StObject.set(x, "SCode", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    }
  }
  
  type MultiPageScrollArgNames = js.Tuple7[Index, ActionX, ActionY, RequestDx, RequestDy, ActualDx, ActualDy]
  
  trait MultiPageScrollParameter extends StObject {
    
    val ActionX: fmScrollAction
    
    val ActionY: fmScrollAction
    
    val ActualDx: ReturnSingle
    
    val ActualDy: ReturnSingle
    
    val Index: Double
    
    val RequestDx: Double
    
    val RequestDy: Double
  }
  object MultiPageScrollParameter {
    
    inline def apply(
      ActionX: fmScrollAction,
      ActionY: fmScrollAction,
      ActualDx: ReturnSingle,
      ActualDy: ReturnSingle,
      Index: Double,
      RequestDx: Double,
      RequestDy: Double
    ): MultiPageScrollParameter = {
      val __obj = js.Dynamic.literal(ActionX = ActionX.asInstanceOf[js.Any], ActionY = ActionY.asInstanceOf[js.Any], ActualDx = ActualDx.asInstanceOf[js.Any], ActualDy = ActualDy.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], RequestDx = RequestDx.asInstanceOf[js.Any], RequestDy = RequestDy.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiPageScrollParameter]
    }
    
    extension [Self <: MultiPageScrollParameter](x: Self) {
      
      inline def setActionX(value: fmScrollAction): Self = StObject.set(x, "ActionX", value.asInstanceOf[js.Any])
      
      inline def setActionY(value: fmScrollAction): Self = StObject.set(x, "ActionY", value.asInstanceOf[js.Any])
      
      inline def setActualDx(value: ReturnSingle): Self = StObject.set(x, "ActualDx", value.asInstanceOf[js.Any])
      
      inline def setActualDy(value: ReturnSingle): Self = StObject.set(x, "ActualDy", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
      
      inline def setRequestDx(value: Double): Self = StObject.set(x, "RequestDx", value.asInstanceOf[js.Any])
      
      inline def setRequestDy(value: Double): Self = StObject.set(x, "RequestDy", value.asInstanceOf[js.Any])
    }
  }
  
  type TabStripBeforeDragOverArgNames = js.Tuple8[Index, Cancel, Data, X, Y, DragState, Effect, Shift]
  
  trait TabStripBeforeDragOverParameter extends StObject {
    
    val Cancel: ReturnBoolean
    
    val Data: DataObject
    
    val DragState: fmDragState
    
    val Effect: ReturnEffect
    
    val Index: Double
    
    val Shift: Double
    
    val X: Double
    
    val Y: Double
  }
  object TabStripBeforeDragOverParameter {
    
    inline def apply(
      Cancel: ReturnBoolean,
      Data: DataObject,
      DragState: fmDragState,
      Effect: ReturnEffect,
      Index: Double,
      Shift: Double,
      X: Double,
      Y: Double
    ): TabStripBeforeDragOverParameter = {
      val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], DragState = DragState.asInstanceOf[js.Any], Effect = Effect.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabStripBeforeDragOverParameter]
    }
    
    extension [Self <: TabStripBeforeDragOverParameter](x: Self) {
      
      inline def setCancel(value: ReturnBoolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
      
      inline def setData(value: DataObject): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setDragState(value: fmDragState): Self = StObject.set(x, "DragState", value.asInstanceOf[js.Any])
      
      inline def setEffect(value: ReturnEffect): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
      
      inline def setShift(value: Double): Self = StObject.set(x, "Shift", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
    }
  }
  
  type TabStripBeforeDropOrPasteArgNames = js.Tuple8[Index, Cancel, Action, Data, X, Y, Effect, Shift]
  
  trait TabStripBeforeDropOrPasteParameter extends StObject {
    
    val Action: fmAction
    
    val Cancel: ReturnBoolean
    
    val Data: DataObject
    
    val Effect: ReturnEffect
    
    val Index: Double
    
    val Shift: Double
    
    val X: Double
    
    val Y: Double
  }
  object TabStripBeforeDropOrPasteParameter {
    
    inline def apply(
      Action: fmAction,
      Cancel: ReturnBoolean,
      Data: DataObject,
      Effect: ReturnEffect,
      Index: Double,
      Shift: Double,
      X: Double,
      Y: Double
    ): TabStripBeforeDropOrPasteParameter = {
      val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Cancel = Cancel.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], Effect = Effect.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabStripBeforeDropOrPasteParameter]
    }
    
    extension [Self <: TabStripBeforeDropOrPasteParameter](x: Self) {
      
      inline def setAction(value: fmAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
      
      inline def setCancel(value: ReturnBoolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
      
      inline def setData(value: DataObject): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setEffect(value: ReturnEffect): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
      
      inline def setShift(value: Double): Self = StObject.set(x, "Shift", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
    }
  }
}

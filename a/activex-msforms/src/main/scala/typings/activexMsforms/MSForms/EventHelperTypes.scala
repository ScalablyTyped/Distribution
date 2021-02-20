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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EventHelperTypes {
  
  type ContainerBeforeDragOverArgNames = js.Tuple8[Cancel, typings.activexMsforms.activexMsformsStrings.Control, Data, X, Y, State, Effect, Shift]
  
  @js.native
  trait ContainerBeforeDragOverParameter extends StObject {
    
    val Cancel: ReturnBoolean = js.native
    
    val Control: typings.activexMsforms.MSForms.Control = js.native
    
    val Data: DataObject = js.native
    
    val Effect: ReturnEffect = js.native
    
    val Shift: Double = js.native
    
    val State: fmDragState = js.native
    
    val X: Double = js.native
    
    val Y: Double = js.native
  }
  object ContainerBeforeDragOverParameter {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ContainerBeforeDragOverParameterMutableBuilder[Self <: ContainerBeforeDragOverParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: ReturnBoolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControl(value: Control): Self = StObject.set(x, "Control", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: DataObject): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffect(value: ReturnEffect): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShift(value: Double): Self = StObject.set(x, "Shift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: fmDragState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
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
  
  @js.native
  trait ContainerBeforeDropOrPasteParameter extends StObject {
    
    val Action: fmAction = js.native
    
    val Cancel: ReturnBoolean = js.native
    
    val Control: typings.activexMsforms.MSForms.Control = js.native
    
    val Data: DataObject = js.native
    
    val Effect: ReturnEffect = js.native
    
    val Shift: Double = js.native
    
    val X: Double = js.native
    
    val Y: Double = js.native
  }
  object ContainerBeforeDropOrPasteParameter {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ContainerBeforeDropOrPasteParameterMutableBuilder[Self <: ContainerBeforeDropOrPasteParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: fmAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancel(value: ReturnBoolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControl(value: Control): Self = StObject.set(x, "Control", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: DataObject): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffect(value: ReturnEffect): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShift(value: Double): Self = StObject.set(x, "Shift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
    }
  }
  
  type ContainerScrollArgNames = js.Tuple6[ActionX, ActionY, RequestDx, RequestDy, ActualDx, ActualDy]
  
  @js.native
  trait ContainerScrollParameter extends StObject {
    
    val ActionX: fmScrollAction = js.native
    
    val ActionY: fmScrollAction = js.native
    
    val ActualDx: ReturnSingle = js.native
    
    val ActualDy: ReturnSingle = js.native
    
    val RequestDx: Double = js.native
    
    val RequestDy: Double = js.native
  }
  object ContainerScrollParameter {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ContainerScrollParameterMutableBuilder[Self <: ContainerScrollParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionX(value: fmScrollAction): Self = StObject.set(x, "ActionX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionY(value: fmScrollAction): Self = StObject.set(x, "ActionY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActualDx(value: ReturnSingle): Self = StObject.set(x, "ActualDx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActualDy(value: ReturnSingle): Self = StObject.set(x, "ActualDy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestDx(value: Double): Self = StObject.set(x, "RequestDx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestDy(value: Double): Self = StObject.set(x, "RequestDy", value.asInstanceOf[js.Any])
    }
  }
  
  type ControlBeforeDragOverArgNames = js.Tuple7[Cancel, Data, X, Y, DragState, Effect, Shift]
  
  @js.native
  trait ControlBeforeDragOverParameter extends StObject {
    
    val Cancel: ReturnBoolean = js.native
    
    val Data: DataObject = js.native
    
    val DragState: fmDragState = js.native
    
    val Effect: ReturnEffect = js.native
    
    val Shift: Double = js.native
    
    val X: Double = js.native
    
    val Y: Double = js.native
  }
  object ControlBeforeDragOverParameter {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ControlBeforeDragOverParameterMutableBuilder[Self <: ControlBeforeDragOverParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: ReturnBoolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: DataObject): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragState(value: fmDragState): Self = StObject.set(x, "DragState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffect(value: ReturnEffect): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShift(value: Double): Self = StObject.set(x, "Shift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
    }
  }
  
  type ControlBeforeDropOrPasteArgNames = js.Tuple7[Cancel, Action, Data, X, Y, Effect, Shift]
  
  @js.native
  trait ControlBeforeDropOrPasteParameter extends StObject {
    
    val Action: fmAction = js.native
    
    val Cancel: ReturnBoolean = js.native
    
    val Data: DataObject = js.native
    
    val Effect: ReturnEffect = js.native
    
    val Shift: Double = js.native
    
    val X: Double = js.native
    
    val Y: Double = js.native
  }
  object ControlBeforeDropOrPasteParameter {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ControlBeforeDropOrPasteParameterMutableBuilder[Self <: ControlBeforeDropOrPasteParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: fmAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancel(value: ReturnBoolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: DataObject): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffect(value: ReturnEffect): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShift(value: Double): Self = StObject.set(x, "Shift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
    }
  }
  
  type ErrorArgNames = js.Tuple7[Number, Description, SCode, Source, HelpFile, HelpContext, CancelDisplay]
  
  @js.native
  trait ErrorParameter extends StObject {
    
    val CancelDisplay: ReturnBoolean = js.native
    
    val Description: ReturnString = js.native
    
    val HelpContext: Double = js.native
    
    val HelpFile: String = js.native
    
    val Number: Double = js.native
    
    val SCode: Double = js.native
    
    val Source: String = js.native
  }
  object ErrorParameter {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ErrorParameterMutableBuilder[Self <: ErrorParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelDisplay(value: ReturnBoolean): Self = StObject.set(x, "CancelDisplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: ReturnString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpContext(value: Double): Self = StObject.set(x, "HelpContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpFile(value: String): Self = StObject.set(x, "HelpFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "Number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSCode(value: Double): Self = StObject.set(x, "SCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
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
  
  @js.native
  trait MultiPageBeforeDragOverParameter extends StObject {
    
    val Cancel: ReturnBoolean = js.native
    
    val Control: typings.activexMsforms.MSForms.Control = js.native
    
    val Data: DataObject = js.native
    
    val Effect: ReturnEffect = js.native
    
    val Index: Double = js.native
    
    val Shift: Double = js.native
    
    val State: fmDragState = js.native
    
    val X: Double = js.native
    
    val Y: Double = js.native
  }
  object MultiPageBeforeDragOverParameter {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class MultiPageBeforeDragOverParameterMutableBuilder[Self <: MultiPageBeforeDragOverParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: ReturnBoolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControl(value: Control): Self = StObject.set(x, "Control", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: DataObject): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffect(value: ReturnEffect): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShift(value: Double): Self = StObject.set(x, "Shift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: fmDragState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
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
  
  @js.native
  trait MultiPageBeforeDropOrPasteParameter extends StObject {
    
    val Action: fmAction = js.native
    
    val Cancel: ReturnBoolean = js.native
    
    val Control: typings.activexMsforms.MSForms.Control = js.native
    
    val Data: DataObject = js.native
    
    val Effect: ReturnEffect = js.native
    
    val Index: Double = js.native
    
    val Shift: Double = js.native
    
    val X: Double = js.native
    
    val Y: Double = js.native
  }
  object MultiPageBeforeDropOrPasteParameter {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class MultiPageBeforeDropOrPasteParameterMutableBuilder[Self <: MultiPageBeforeDropOrPasteParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: fmAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancel(value: ReturnBoolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControl(value: Control): Self = StObject.set(x, "Control", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: DataObject): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffect(value: ReturnEffect): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShift(value: Double): Self = StObject.set(x, "Shift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
    }
  }
  
  type MultiPageErrorArgNames = js.Tuple8[Index, Number, Description, SCode, Source, HelpFile, HelpContext, CancelDisplay]
  
  @js.native
  trait MultiPageErrorParameter extends StObject {
    
    val CancelDisplay: ReturnBoolean = js.native
    
    val Description: ReturnString = js.native
    
    val HelpContext: Double = js.native
    
    val HelpFile: String = js.native
    
    val Index: Double = js.native
    
    val Number: Double = js.native
    
    val SCode: Double = js.native
    
    val Source: String = js.native
  }
  object MultiPageErrorParameter {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class MultiPageErrorParameterMutableBuilder[Self <: MultiPageErrorParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelDisplay(value: ReturnBoolean): Self = StObject.set(x, "CancelDisplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: ReturnString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpContext(value: Double): Self = StObject.set(x, "HelpContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpFile(value: String): Self = StObject.set(x, "HelpFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "Number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSCode(value: Double): Self = StObject.set(x, "SCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    }
  }
  
  type MultiPageScrollArgNames = js.Tuple7[Index, ActionX, ActionY, RequestDx, RequestDy, ActualDx, ActualDy]
  
  @js.native
  trait MultiPageScrollParameter extends StObject {
    
    val ActionX: fmScrollAction = js.native
    
    val ActionY: fmScrollAction = js.native
    
    val ActualDx: ReturnSingle = js.native
    
    val ActualDy: ReturnSingle = js.native
    
    val Index: Double = js.native
    
    val RequestDx: Double = js.native
    
    val RequestDy: Double = js.native
  }
  object MultiPageScrollParameter {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class MultiPageScrollParameterMutableBuilder[Self <: MultiPageScrollParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionX(value: fmScrollAction): Self = StObject.set(x, "ActionX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionY(value: fmScrollAction): Self = StObject.set(x, "ActionY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActualDx(value: ReturnSingle): Self = StObject.set(x, "ActualDx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActualDy(value: ReturnSingle): Self = StObject.set(x, "ActualDy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestDx(value: Double): Self = StObject.set(x, "RequestDx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestDy(value: Double): Self = StObject.set(x, "RequestDy", value.asInstanceOf[js.Any])
    }
  }
  
  type TabStripBeforeDragOverArgNames = js.Tuple8[Index, Cancel, Data, X, Y, DragState, Effect, Shift]
  
  @js.native
  trait TabStripBeforeDragOverParameter extends StObject {
    
    val Cancel: ReturnBoolean = js.native
    
    val Data: DataObject = js.native
    
    val DragState: fmDragState = js.native
    
    val Effect: ReturnEffect = js.native
    
    val Index: Double = js.native
    
    val Shift: Double = js.native
    
    val X: Double = js.native
    
    val Y: Double = js.native
  }
  object TabStripBeforeDragOverParameter {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class TabStripBeforeDragOverParameterMutableBuilder[Self <: TabStripBeforeDragOverParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: ReturnBoolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: DataObject): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragState(value: fmDragState): Self = StObject.set(x, "DragState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffect(value: ReturnEffect): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShift(value: Double): Self = StObject.set(x, "Shift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
    }
  }
  
  type TabStripBeforeDropOrPasteArgNames = js.Tuple8[Index, Cancel, Action, Data, X, Y, Effect, Shift]
  
  @js.native
  trait TabStripBeforeDropOrPasteParameter extends StObject {
    
    val Action: fmAction = js.native
    
    val Cancel: ReturnBoolean = js.native
    
    val Data: DataObject = js.native
    
    val Effect: ReturnEffect = js.native
    
    val Index: Double = js.native
    
    val Shift: Double = js.native
    
    val X: Double = js.native
    
    val Y: Double = js.native
  }
  object TabStripBeforeDropOrPasteParameter {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class TabStripBeforeDropOrPasteParameterMutableBuilder[Self <: TabStripBeforeDropOrPasteParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: fmAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancel(value: ReturnBoolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: DataObject): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffect(value: ReturnEffect): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShift(value: Double): Self = StObject.set(x, "Shift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
    }
  }
}

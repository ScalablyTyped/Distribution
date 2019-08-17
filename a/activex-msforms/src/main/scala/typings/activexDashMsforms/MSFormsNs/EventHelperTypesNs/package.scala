package typings.activexDashMsforms.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventHelperTypesNs {
  import typings.activexDashMsforms.activexDashMsformsStrings.Action
  import typings.activexDashMsforms.activexDashMsformsStrings.ActionX
  import typings.activexDashMsforms.activexDashMsformsStrings.ActionY
  import typings.activexDashMsforms.activexDashMsformsStrings.ActualDx
  import typings.activexDashMsforms.activexDashMsformsStrings.ActualDy
  import typings.activexDashMsforms.activexDashMsformsStrings.Cancel
  import typings.activexDashMsforms.activexDashMsformsStrings.CancelDisplay
  import typings.activexDashMsforms.activexDashMsformsStrings.Data
  import typings.activexDashMsforms.activexDashMsformsStrings.Description
  import typings.activexDashMsforms.activexDashMsformsStrings.DragState
  import typings.activexDashMsforms.activexDashMsformsStrings.Effect
  import typings.activexDashMsforms.activexDashMsformsStrings.HelpContext
  import typings.activexDashMsforms.activexDashMsformsStrings.HelpFile
  import typings.activexDashMsforms.activexDashMsformsStrings.Index
  import typings.activexDashMsforms.activexDashMsformsStrings.Number
  import typings.activexDashMsforms.activexDashMsformsStrings.RequestDx
  import typings.activexDashMsforms.activexDashMsformsStrings.RequestDy
  import typings.activexDashMsforms.activexDashMsformsStrings.SCode
  import typings.activexDashMsforms.activexDashMsformsStrings.Shift
  import typings.activexDashMsforms.activexDashMsformsStrings.Source
  import typings.activexDashMsforms.activexDashMsformsStrings.State
  import typings.activexDashMsforms.activexDashMsformsStrings.X
  import typings.activexDashMsforms.activexDashMsformsStrings.Y

  type Container_BeforeDragOver_ArgNames = js.Tuple8[
    Cancel, 
    typings.activexDashMsforms.activexDashMsformsStrings.Control, 
    Data, 
    X, 
    Y, 
    State, 
    Effect, 
    Shift
  ]
  type Container_BeforeDropOrPaste_ArgNames = js.Tuple8[
    Cancel, 
    typings.activexDashMsforms.activexDashMsformsStrings.Control, 
    Action, 
    Data, 
    X, 
    Y, 
    Effect, 
    Shift
  ]
  type Container_Scroll_ArgNames = js.Tuple6[ActionX, ActionY, RequestDx, RequestDy, ActualDx, ActualDy]
  type Control_BeforeDragOver_ArgNames = js.Tuple7[Cancel, Data, X, Y, DragState, Effect, Shift]
  type Control_BeforeDropOrPaste_ArgNames = js.Tuple7[Cancel, Action, Data, X, Y, Effect, Shift]
  type Error_ArgNames = js.Tuple7[Number, Description, SCode, Source, HelpFile, HelpContext, CancelDisplay]
  type MultiPage_BeforeDragOver_ArgNames = js.Tuple9[
    Index, 
    Cancel, 
    typings.activexDashMsforms.activexDashMsformsStrings.Control, 
    Data, 
    X, 
    Y, 
    State, 
    Effect, 
    Shift
  ]
  type MultiPage_BeforeDropOrPaste_ArgNames = js.Tuple9[
    Index, 
    Cancel, 
    typings.activexDashMsforms.activexDashMsformsStrings.Control, 
    Action, 
    Data, 
    X, 
    Y, 
    Effect, 
    Shift
  ]
  type MultiPage_Error_ArgNames = js.Tuple8[Index, Number, Description, SCode, Source, HelpFile, HelpContext, CancelDisplay]
  type MultiPage_Scroll_ArgNames = js.Tuple7[Index, ActionX, ActionY, RequestDx, RequestDy, ActualDx, ActualDy]
  type TabStrip_BeforeDragOver_ArgNames = js.Tuple8[Index, Cancel, Data, X, Y, DragState, Effect, Shift]
  type TabStrip_BeforeDropOrPaste_ArgNames = js.Tuple8[Index, Cancel, Action, Data, X, Y, Effect, Shift]
}

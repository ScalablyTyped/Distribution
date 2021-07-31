package typings.agGrid

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.columnMod.Column
import typings.agGrid.gridApiMod.GridApi
import typings.agGrid.iComponentMod.IComponent
import typings.agGrid.rowNodeMod.RowNode
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iCellEditorMod {
  
  trait ICellEditor extends StObject {
    
    /** If doing full line edit, then gets called when focus should be put into the editor */
    var focusIn: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** If doing full line edit, then gets called when focus is leaving the editor */
    var focusOut: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Return the final value - called by the grid once after editing is complete */
    def getValue(): js.Any
    
    /** Gets called once after editing is complete. If your return true, then the new value will not be used. The
      *  editing will have no impact on the record. Use this if you do not want a new value from your gui, i.e. you
      *  want to cancel the editing. */
    var isCancelAfterEnd: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** Gets called once after initialised. If you return true, the editor will not be used and the grid will continue
      *  editing. Use this to make a decision on editing inside the init() function, eg maybe you want to only start
      *  editing if the user hits a numeric key, but not a letter, if the editor is for numbers.
      * */
    var isCancelBeforeStart: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** Gets called once after initialised. If you return true, the editor will appear in a popup, so is not constrained
      *  to the boundaries of the cell. This is great if you want to, for example, provide you own custom dropdown list
      *  for selection. Default is false (ie if you don't provide the method). */
    var isPopup: js.UndefOr[js.Function0[Boolean]] = js.undefined
  }
  object ICellEditor {
    
    @scala.inline
    def apply(getValue: () => js.Any): ICellEditor = {
      val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue))
      __obj.asInstanceOf[ICellEditor]
    }
    
    @scala.inline
    implicit class ICellEditorMutableBuilder[Self <: ICellEditor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocusIn(value: () => Unit): Self = StObject.set(x, "focusIn", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFocusInUndefined: Self = StObject.set(x, "focusIn", js.undefined)
      
      @scala.inline
      def setFocusOut(value: () => Unit): Self = StObject.set(x, "focusOut", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFocusOutUndefined: Self = StObject.set(x, "focusOut", js.undefined)
      
      @scala.inline
      def setGetValue(value: () => js.Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsCancelAfterEnd(value: () => Boolean): Self = StObject.set(x, "isCancelAfterEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsCancelAfterEndUndefined: Self = StObject.set(x, "isCancelAfterEnd", js.undefined)
      
      @scala.inline
      def setIsCancelBeforeStart(value: () => Boolean): Self = StObject.set(x, "isCancelBeforeStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsCancelBeforeStartUndefined: Self = StObject.set(x, "isCancelBeforeStart", js.undefined)
      
      @scala.inline
      def setIsPopup(value: () => Boolean): Self = StObject.set(x, "isPopup", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsPopupUndefined: Self = StObject.set(x, "isPopup", js.undefined)
    }
  }
  
  trait ICellEditorComp
    extends StObject
       with ICellEditor
       with IComponent[ICellEditorParams]
  object ICellEditorComp {
    
    @scala.inline
    def apply(getGui: () => HTMLElement, getValue: () => js.Any): ICellEditorComp = {
      val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui), getValue = js.Any.fromFunction0(getValue))
      __obj.asInstanceOf[ICellEditorComp]
    }
  }
  
  @js.native
  trait ICellEditorParams extends StObject {
    
    @JSName("$scope")
    var $scope: js.Any = js.native
    
    var api: GridApi = js.native
    
    var cellStartedEdit: Boolean = js.native
    
    var charPress: String = js.native
    
    var column: Column = js.native
    
    var columnApi: ColumnApi = js.native
    
    var context: js.Any = js.native
    
    var eGridCell: HTMLElement = js.native
    
    def formatValue(value: js.Any): js.Any = js.native
    
    var keyPress: Double = js.native
    
    var node: RowNode = js.native
    
    def onKeyDown(event: KeyboardEvent): Unit = js.native
    
    def parseValue(value: js.Any): js.Any = js.native
    
    var rowIndex: Double = js.native
    
    def stopEditing(): Unit = js.native
    def stopEditing(suppressNavigateAfterEdit: Boolean): Unit = js.native
    
    var value: js.Any = js.native
  }
}

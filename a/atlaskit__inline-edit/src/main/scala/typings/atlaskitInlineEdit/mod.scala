package typings.atlaskitInlineEdit

import typings.react.mod.Component
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@atlaskit/inline-edit", JSImport.Default)
  @js.native
  class default ()
    extends Component[StatefulProps, js.Object, js.Any]
  
  @JSImport("@atlaskit/inline-edit", "InlineEditStateless")
  @js.native
  class InlineEditStateless protected ()
    extends Component[StatelessProps, js.Object, js.Any] {
    def this(props: StatelessProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: StatelessProps, context: js.Any) = this()
  }
  
  trait BaseProps extends StObject {
    
    /** Sets whether the checkmark and cross are displayed in the bottom right fo the field. */
    var areActionButtonsHidden: js.UndefOr[Boolean] = js.undefined
    
    /** Set whether default stylings should be disabled when editing. */
    var disableEditViewFieldBase: js.UndefOr[Boolean] = js.undefined
    
    /** Component to be shown when editing. Should be an @atlaskit/input. */
    var editView: js.UndefOr[ReactElement] = js.undefined
    
    /** Component to be shown in an @atlaskit/inline-dialog when edit view is open. */
    var invalidMessage: js.UndefOr[ReactElement] = js.undefined
    
    /** Sets whether the confirm function is called when the input loses focus. */
    var isConfirmOnBlurDisabled: js.UndefOr[Boolean] = js.undefined
    
    /** Set whether the read view should fit width, most obvious when hovered. */
    var isFitContainerWidthReadView: js.UndefOr[Boolean] = js.undefined
    
    /** Sets yellow border with warning symbol at end of input. Removes confirm and cancel buttons. */
    var isInvalid: js.UndefOr[Boolean] = js.undefined
    
    /** Determine whether the label is shown. */
    var isLabelHidden: js.UndefOr[Boolean] = js.undefined
    
    /** Greys out text and shows spinner. Does not disable input. */
    var isWaiting: js.UndefOr[Boolean] = js.undefined
    
    /** Label above the input. */
    var label: js.UndefOr[String] = js.undefined
    
    /** html to pass down to the label htmlFor prop. */
    var labelHtmlFor: js.UndefOr[String] = js.undefined
    
    /** Handler called when the cross is clicked on. */
    def onCancel(): Unit
    
    /** Handler called when checkmark is clicked. Also by default called when the input loses focus. */
    def onConfirm(): Unit
    
    /** Component to be shown when reading only */
    var readView: ReactElement
    
    /** Set whether onConfirm is called on pressing enter. */
    var shouldConfirmOnEnter: js.UndefOr[Boolean] = js.undefined
  }
  object BaseProps {
    
    inline def apply(onCancel: () => Unit, onConfirm: () => Unit, readView: ReactElement): BaseProps = {
      val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), onConfirm = js.Any.fromFunction0(onConfirm), readView = readView.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseProps]
    }
    
    extension [Self <: BaseProps](x: Self) {
      
      inline def setAreActionButtonsHidden(value: Boolean): Self = StObject.set(x, "areActionButtonsHidden", value.asInstanceOf[js.Any])
      
      inline def setAreActionButtonsHiddenUndefined: Self = StObject.set(x, "areActionButtonsHidden", js.undefined)
      
      inline def setDisableEditViewFieldBase(value: Boolean): Self = StObject.set(x, "disableEditViewFieldBase", value.asInstanceOf[js.Any])
      
      inline def setDisableEditViewFieldBaseUndefined: Self = StObject.set(x, "disableEditViewFieldBase", js.undefined)
      
      inline def setEditView(value: ReactElement): Self = StObject.set(x, "editView", value.asInstanceOf[js.Any])
      
      inline def setEditViewUndefined: Self = StObject.set(x, "editView", js.undefined)
      
      inline def setInvalidMessage(value: ReactElement): Self = StObject.set(x, "invalidMessage", value.asInstanceOf[js.Any])
      
      inline def setInvalidMessageUndefined: Self = StObject.set(x, "invalidMessage", js.undefined)
      
      inline def setIsConfirmOnBlurDisabled(value: Boolean): Self = StObject.set(x, "isConfirmOnBlurDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsConfirmOnBlurDisabledUndefined: Self = StObject.set(x, "isConfirmOnBlurDisabled", js.undefined)
      
      inline def setIsFitContainerWidthReadView(value: Boolean): Self = StObject.set(x, "isFitContainerWidthReadView", value.asInstanceOf[js.Any])
      
      inline def setIsFitContainerWidthReadViewUndefined: Self = StObject.set(x, "isFitContainerWidthReadView", js.undefined)
      
      inline def setIsInvalid(value: Boolean): Self = StObject.set(x, "isInvalid", value.asInstanceOf[js.Any])
      
      inline def setIsInvalidUndefined: Self = StObject.set(x, "isInvalid", js.undefined)
      
      inline def setIsLabelHidden(value: Boolean): Self = StObject.set(x, "isLabelHidden", value.asInstanceOf[js.Any])
      
      inline def setIsLabelHiddenUndefined: Self = StObject.set(x, "isLabelHidden", js.undefined)
      
      inline def setIsWaiting(value: Boolean): Self = StObject.set(x, "isWaiting", value.asInstanceOf[js.Any])
      
      inline def setIsWaitingUndefined: Self = StObject.set(x, "isWaiting", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelHtmlFor(value: String): Self = StObject.set(x, "labelHtmlFor", value.asInstanceOf[js.Any])
      
      inline def setLabelHtmlForUndefined: Self = StObject.set(x, "labelHtmlFor", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
      
      inline def setOnConfirm(value: () => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction0(value))
      
      inline def setReadView(value: ReactElement): Self = StObject.set(x, "readView", value.asInstanceOf[js.Any])
      
      inline def setShouldConfirmOnEnter(value: Boolean): Self = StObject.set(x, "shouldConfirmOnEnter", value.asInstanceOf[js.Any])
      
      inline def setShouldConfirmOnEnterUndefined: Self = StObject.set(x, "shouldConfirmOnEnter", js.undefined)
    }
  }
  
  type InlineEdit = Component[StatefulProps, js.Object, js.Any]
  
  type StatefulProps = BaseProps
  
  trait StatelessProps
    extends StObject
       with BaseProps {
    
    /** Whether the component shows the readView or the editView. */
    var isEditing: Boolean
    
    /** Handler called when the wrapper or the label are clicked. */
    def onEditRequested(): Unit
  }
  object StatelessProps {
    
    inline def apply(
      isEditing: Boolean,
      onCancel: () => Unit,
      onConfirm: () => Unit,
      onEditRequested: () => Unit,
      readView: ReactElement
    ): StatelessProps = {
      val __obj = js.Dynamic.literal(isEditing = isEditing.asInstanceOf[js.Any], onCancel = js.Any.fromFunction0(onCancel), onConfirm = js.Any.fromFunction0(onConfirm), onEditRequested = js.Any.fromFunction0(onEditRequested), readView = readView.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatelessProps]
    }
    
    extension [Self <: StatelessProps](x: Self) {
      
      inline def setIsEditing(value: Boolean): Self = StObject.set(x, "isEditing", value.asInstanceOf[js.Any])
      
      inline def setOnEditRequested(value: () => Unit): Self = StObject.set(x, "onEditRequested", js.Any.fromFunction0(value))
    }
  }
}

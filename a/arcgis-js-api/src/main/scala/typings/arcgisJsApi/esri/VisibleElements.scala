package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisibleElements extends StObject {
  
  /**
  		 * Indicates whether to display the `Add` button which prompts the dialog to add a new attachment.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#VisibleElements)
  		 */
  var addButton: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether to display the `add` button after selecting the attachment to add.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#VisibleElements)
  		 */
  var addSubmitButton: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether to display the `cancel` button after selecting the attachment to add.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#VisibleElements)
  		 */
  var cancelAddButton: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether to display the `cancel` button after selecting an attachment to update an existing attachment.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#VisibleElements)
  		 */
  var cancelUpdateButton: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether to display the `delete` button to delete an existing attachment.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#VisibleElements)
  		 */
  var deleteButton: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether to display an error message if adding or updating an attachment results in errors.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#VisibleElements)
  		 */
  var errorMessage: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether to display a progress bar when adding an attachment.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#VisibleElements)
  		 */
  var progressBar: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether to display an `update` button to allow updating on existing attachments.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments.html#VisibleElements)
  		 */
  var updateButton: js.UndefOr[Boolean] = js.undefined
}
object VisibleElements {
  
  inline def apply(): VisibleElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisibleElements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisibleElements] (val x: Self) extends AnyVal {
    
    inline def setAddButton(value: Boolean): Self = StObject.set(x, "addButton", value.asInstanceOf[js.Any])
    
    inline def setAddButtonUndefined: Self = StObject.set(x, "addButton", js.undefined)
    
    inline def setAddSubmitButton(value: Boolean): Self = StObject.set(x, "addSubmitButton", value.asInstanceOf[js.Any])
    
    inline def setAddSubmitButtonUndefined: Self = StObject.set(x, "addSubmitButton", js.undefined)
    
    inline def setCancelAddButton(value: Boolean): Self = StObject.set(x, "cancelAddButton", value.asInstanceOf[js.Any])
    
    inline def setCancelAddButtonUndefined: Self = StObject.set(x, "cancelAddButton", js.undefined)
    
    inline def setCancelUpdateButton(value: Boolean): Self = StObject.set(x, "cancelUpdateButton", value.asInstanceOf[js.Any])
    
    inline def setCancelUpdateButtonUndefined: Self = StObject.set(x, "cancelUpdateButton", js.undefined)
    
    inline def setDeleteButton(value: Boolean): Self = StObject.set(x, "deleteButton", value.asInstanceOf[js.Any])
    
    inline def setDeleteButtonUndefined: Self = StObject.set(x, "deleteButton", js.undefined)
    
    inline def setErrorMessage(value: Boolean): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setProgressBar(value: Boolean): Self = StObject.set(x, "progressBar", value.asInstanceOf[js.Any])
    
    inline def setProgressBarUndefined: Self = StObject.set(x, "progressBar", js.undefined)
    
    inline def setUpdateButton(value: Boolean): Self = StObject.set(x, "updateButton", value.asInstanceOf[js.Any])
    
    inline def setUpdateButtonUndefined: Self = StObject.set(x, "updateButton", js.undefined)
  }
}

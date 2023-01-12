package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDatasetRequest extends StObject {
  
  /**
    * The file format of a dataset that is created from an Amazon S3 file or folder.
    */
  var Format: js.UndefOr[InputFormat] = js.undefined
  
  var FormatOptions: js.UndefOr[typings.awsSdk.clientsDatabrewMod.FormatOptions] = js.undefined
  
  var Input: typings.awsSdk.clientsDatabrewMod.Input
  
  /**
    * The name of the dataset to be updated.
    */
  var Name: DatasetName
  
  /**
    * A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
    */
  var PathOptions: js.UndefOr[typings.awsSdk.clientsDatabrewMod.PathOptions] = js.undefined
}
object UpdateDatasetRequest {
  
  inline def apply(Input: Input, Name: DatasetName): UpdateDatasetRequest = {
    val __obj = js.Dynamic.literal(Input = Input.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDatasetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDatasetRequest] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: InputFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setFormatOptions(value: FormatOptions): Self = StObject.set(x, "FormatOptions", value.asInstanceOf[js.Any])
    
    inline def setFormatOptionsUndefined: Self = StObject.set(x, "FormatOptions", js.undefined)
    
    inline def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    inline def setInput(value: Input): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    inline def setName(value: DatasetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPathOptions(value: PathOptions): Self = StObject.set(x, "PathOptions", value.asInstanceOf[js.Any])
    
    inline def setPathOptionsUndefined: Self = StObject.set(x, "PathOptions", js.undefined)
  }
}

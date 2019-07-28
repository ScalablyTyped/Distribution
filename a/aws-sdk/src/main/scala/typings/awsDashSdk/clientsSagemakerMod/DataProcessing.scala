package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataProcessing extends js.Object {
  /**
    * A JSONPath expression used to select a portion of the input data to pass to the algorithm. Use the InputFilter parameter to exclude fields, such as an ID column, from the input. If you want Amazon SageMaker to pass the entire input dataset to the algorithm, accept the default value $. Examples: "$", "$[1:]", "$.features" 
    */
  var InputFilter: js.UndefOr[JsonPath] = js.undefined
  /**
    * Specifies the source of the data to join with the transformed data. The valid values are None and Input The default value is None which specifies not to join the input with the transformed data. If you want the batch transform job to join the original input data with the transformed data, set JoinSource to Input. To join input and output, the batch transform job must satisfy the Requirements for Using Batch Transform I/O Join. For JSON or JSONLines objects, such as a JSON array, Amazon SageMaker adds the transformed data to the input JSON object in an attribute called SageMakerOutput. The joined result for JSON must be a key-value pair object. If the input is not a key-value pair object, Amazon SageMaker creates a new JSON file. In the new JSON file, and the input data is stored under the SageMakerInput key and the results are stored in SageMakerOutput. For CSV files, Amazon SageMaker combines the transformed data with the input data at the end of the input data and stores it in the output file. The joined data has the joined input data followed by the transformed data and the output is a CSV file. 
    */
  var JoinSource: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.JoinSource] = js.undefined
  /**
    * A JSONPath expression used to select a portion of the joined dataset to save in the output file for a batch transform job. If you want Amazon SageMaker to store the entire input dataset in the output file, leave the default value, $. If you specify indexes that aren't within the dimension size of the joined dataset, you get an error. Examples: "$", "$[0,5:]", "$.['id','SageMakerOutput']" 
    */
  var OutputFilter: js.UndefOr[JsonPath] = js.undefined
}

object DataProcessing {
  @scala.inline
  def apply(InputFilter: JsonPath = null, JoinSource: JoinSource = null, OutputFilter: JsonPath = null): DataProcessing = {
    val __obj = js.Dynamic.literal()
    if (InputFilter != null) __obj.updateDynamic("InputFilter")(InputFilter)
    if (JoinSource != null) __obj.updateDynamic("JoinSource")(JoinSource.asInstanceOf[js.Any])
    if (OutputFilter != null) __obj.updateDynamic("OutputFilter")(OutputFilter)
    __obj.asInstanceOf[DataProcessing]
  }
}


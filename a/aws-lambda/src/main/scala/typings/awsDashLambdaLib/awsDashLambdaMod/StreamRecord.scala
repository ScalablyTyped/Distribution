package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StreamRecord extends js.Object {
  var ApproximateCreationDateTime: js.UndefOr[scala.Double] = js.undefined
  var Keys: js.UndefOr[ScalablyTyped.runtime.StringDictionary[AttributeValue]] = js.undefined
  var NewImage: js.UndefOr[ScalablyTyped.runtime.StringDictionary[AttributeValue]] = js.undefined
  var OldImage: js.UndefOr[ScalablyTyped.runtime.StringDictionary[AttributeValue]] = js.undefined
  var SequenceNumber: js.UndefOr[java.lang.String] = js.undefined
  var SizeBytes: js.UndefOr[scala.Double] = js.undefined
  var StreamViewType: js.UndefOr[
    awsDashLambdaLib.awsDashLambdaLibStrings.KEYS_ONLY | awsDashLambdaLib.awsDashLambdaLibStrings.NEW_IMAGE | awsDashLambdaLib.awsDashLambdaLibStrings.OLD_IMAGE | awsDashLambdaLib.awsDashLambdaLibStrings.NEW_AND_OLD_IMAGES
  ] = js.undefined
}


package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrokClassifier extends js.Object {
  /**
    * An identifier of the data format that the classifier matches, such as Twitter, JSON, Omniture logs, and so on.
    */
  var Classification: typings.awsDashSdk.clientsGlueMod.Classification
  /**
    * The time that this classifier was registered.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Optional custom grok patterns defined by this classifier. For more information, see custom patterns in Writing Custom Classifiers.
    */
  var CustomPatterns: js.UndefOr[typings.awsDashSdk.clientsGlueMod.CustomPatterns] = js.undefined
  /**
    * The grok pattern applied to a data store by this classifier. For more information, see built-in patterns in Writing Custom Classifiers.
    */
  var GrokPattern: typings.awsDashSdk.clientsGlueMod.GrokPattern
  /**
    * The time that this classifier was last updated.
    */
  var LastUpdated: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the classifier.
    */
  var Name: NameString
  /**
    * The version of this classifier.
    */
  var Version: js.UndefOr[VersionId] = js.undefined
}

object GrokClassifier {
  @scala.inline
  def apply(
    Classification: Classification,
    GrokPattern: GrokPattern,
    Name: NameString,
    CreationTime: Timestamp = null,
    CustomPatterns: CustomPatterns = null,
    LastUpdated: Timestamp = null,
    Version: js.UndefOr[VersionId] = js.undefined
  ): GrokClassifier = {
    val __obj = js.Dynamic.literal(Classification = Classification, GrokPattern = GrokPattern, Name = Name)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (CustomPatterns != null) __obj.updateDynamic("CustomPatterns")(CustomPatterns)
    if (LastUpdated != null) __obj.updateDynamic("LastUpdated")(LastUpdated)
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[GrokClassifier]
  }
}


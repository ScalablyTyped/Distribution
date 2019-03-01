package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A {@link RedlinePortion} is a {@link TextPortion} that marks a change that has been recorded by the change tracking. */
trait RedlinePortion extends TextPortion {
  /** determines whether the portion is member of a header or footer text. */
  var IsInHeaderFooter: scala.Boolean
  /** determines whether the last paragraph of a redline text has to be merged with a possible following text content (i.e. a text table) */
  var MergeLastPara: scala.Boolean
  /** contains the name of the author of the change. */
  var RedlineAuthor: java.lang.String
  /** contains a comment for the change. */
  var RedlineComment: java.lang.String
  /** contains the date and time of the change. */
  var RedlineDateTime: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime
  /**
    * contains a unique identifier for the redline. This is necessary for file export filters to able to recognize redline portions that point to the same
    * redline.
    */
  var RedlineIdentifier: java.lang.String
  /**
    * contains the data of a second level redline data
    *
    * The elements of the sequence are:
    *
    *
    *
    * string RedlineAuthor;
    *
    *
    *
    * {@link com.sun.star.util.DateTime} RedlineDateTime;
    *
    *
    *
    * string RedlineComment;
    *
    *
    *
    * string RedlineType;
    */
  var RedlineSuccessorData: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
  /**
    * provides access to the text of the redline. This interface is only provided if the change is not visible. The visibility depends on the redline
    * display options that are set at the documents property set (RedlineDisplayType).
    */
  var RedlineText: XText
  /**
    * contains the type of the change
    *
    * Valid type names are:
    *
    *
    *
    * Insert - marks an insertion
    *
    *
    *
    * Delete - marks an deletion
    *
    *
    *
    * Format - marks an attribute change
    *
    *
    *
    * {@link TextTable} - marks a text table
    *
    *
    *
    * Style - marks an applied style
    */
  var RedlineType: java.lang.String
}

object RedlinePortion {
  @scala.inline
  def apply(
    IsInHeaderFooter: scala.Boolean,
    MergeLastPara: scala.Boolean,
    RedlineAuthor: java.lang.String,
    RedlineComment: java.lang.String,
    RedlineDateTime: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.DateTime,
    RedlineIdentifier: java.lang.String,
    RedlineSuccessorData: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues,
    RedlineText: XText,
    RedlineType: java.lang.String,
    TextPortion: TextPortion = null
  ): RedlinePortion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("IsInHeaderFooter")(IsInHeaderFooter)
    __obj.updateDynamic("MergeLastPara")(MergeLastPara)
    __obj.updateDynamic("RedlineAuthor")(RedlineAuthor)
    __obj.updateDynamic("RedlineComment")(RedlineComment)
    __obj.updateDynamic("RedlineDateTime")(RedlineDateTime)
    __obj.updateDynamic("RedlineIdentifier")(RedlineIdentifier)
    __obj.updateDynamic("RedlineSuccessorData")(RedlineSuccessorData.asInstanceOf[js.Any])
    __obj.updateDynamic("RedlineText")(RedlineText)
    __obj.updateDynamic("RedlineType")(RedlineType)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, TextPortion)
    __obj.asInstanceOf[RedlinePortion]
  }
}


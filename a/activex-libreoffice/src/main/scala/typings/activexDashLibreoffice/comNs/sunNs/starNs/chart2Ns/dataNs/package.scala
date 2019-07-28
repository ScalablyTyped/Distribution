package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns

import typings.activexDashLibreoffice.comNs.sunNs.starNs.viewNs.XSelectionChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dataNs {
  /**
    * a string that states in what way a {@link DataSequence} should be used. If this property is an empty string, no proposition about usage is made.
    *
    * The strings can have any value. However some values are predefined and should always be interpreted in the same way.
    *
    * **label **: values are used as a label for a series. Usually, you will have just one cell containing a string.
    *
    * **values-x **: values are used as x-values in an XY- or bubble diagram
    *
    * **values-y **: values are used as y-values in an XY-Diagram or as values in a bar, line, etc. chart
    *
    * **values-z **: values may be used as z-values in a three-dimensional XYZ-Diagram or a surface-chart
    *
    * **sizes **: values are used as radius of the bubbles in a Bubble-Diagram
    *
    * **error-bars-x-positive **: values are used as error-information in positive x-direction for displaying error-bars
    *
    * **error-bars-x-negative **: values are used as error-information in negative x-direction for displaying error-bars
    *
    * **error-bars-y-positive **: values are used as error-information in positive y-direction for displaying error-bars
    *
    * **error-bars-y-negative **: values are used as error-information in negative y-direction for displaying error-bars
    *
    * **categories **: values are used for categories in the diagram
    *
    *
    *
    * In a candle-stick chart you have the following roles:
    *
    * **values-first **: the first value of a series of values. In a stock-chart this would be the opening course.
    *
    * **values-last **: the last value of a series of values. In a stock-chart this would be the closing course.
    *
    * **values-min **: the minimum value of a series of values. In a stock-chart this would be the lowest course that occurred during trading.
    *
    * **values-max **: the maximum value of a series of values. In a stock-chart this would be the highest course that occurred during trading.
    */
  type DataSequenceRole = String
  /** describes a service that allows reading two-dimensional data in the form of a sequence of DataSequences. */
  type DataSink = XDataSink
  /** describes a service that allows reading two-dimensional data in the form of a sequence of DataSequences. */
  type DataSource = XDataSource
  /** describes a container for a sequence pair of value-sequences, one for a label and one for the associated data. */
  type LabeledDataSequence = XLabeledDataSequence2
  /**
    * A selection change listener that is attached to a {@link XRangeHighlighter} in order to get notified about selection changes that affect range
    * highlighting.
    */
  type RangeHighlightListener = XSelectionChangeListener
  type RangeHighlighter = XRangeHighlighter
}

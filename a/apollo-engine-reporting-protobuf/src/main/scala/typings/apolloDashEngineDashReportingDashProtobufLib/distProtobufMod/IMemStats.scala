package typings
package apolloDashEngineDashReportingDashProtobufLib.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMemStats extends js.Object {
  /** MemStats gcCountDelta */
  var gcCountDelta: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** MemStats gcOverheadBytes */
  var gcOverheadBytes: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** MemStats gcStwNsDelta */
  var gcStwNsDelta: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** MemStats heapAllocatedBytes */
  var heapAllocatedBytes: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** MemStats heapAllocatedBytesDelta */
  var heapAllocatedBytesDelta: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** MemStats heapAllocatedObjects */
  var heapAllocatedObjects: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** MemStats heapAllocatedObjectsDelta */
  var heapAllocatedObjectsDelta: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** MemStats heapBytes */
  var heapBytes: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** MemStats heapFreedObjectsDelta */
  var heapFreedObjectsDelta: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** MemStats heapReleasedBytes */
  var heapReleasedBytes: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** MemStats stackBytes */
  var stackBytes: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** MemStats stackUsedBytes */
  var stackUsedBytes: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** MemStats totalBytes */
  var totalBytes: js.UndefOr[scala.Double | scala.Null] = js.undefined
}

object IMemStats {
  @scala.inline
  def apply(
    gcCountDelta: scala.Int | scala.Double = null,
    gcOverheadBytes: scala.Int | scala.Double = null,
    gcStwNsDelta: scala.Int | scala.Double = null,
    heapAllocatedBytes: scala.Int | scala.Double = null,
    heapAllocatedBytesDelta: scala.Int | scala.Double = null,
    heapAllocatedObjects: scala.Int | scala.Double = null,
    heapAllocatedObjectsDelta: scala.Int | scala.Double = null,
    heapBytes: scala.Int | scala.Double = null,
    heapFreedObjectsDelta: scala.Int | scala.Double = null,
    heapReleasedBytes: scala.Int | scala.Double = null,
    stackBytes: scala.Int | scala.Double = null,
    stackUsedBytes: scala.Int | scala.Double = null,
    totalBytes: scala.Int | scala.Double = null
  ): IMemStats = {
    val __obj = js.Dynamic.literal()
    if (gcCountDelta != null) __obj.updateDynamic("gcCountDelta")(gcCountDelta.asInstanceOf[js.Any])
    if (gcOverheadBytes != null) __obj.updateDynamic("gcOverheadBytes")(gcOverheadBytes.asInstanceOf[js.Any])
    if (gcStwNsDelta != null) __obj.updateDynamic("gcStwNsDelta")(gcStwNsDelta.asInstanceOf[js.Any])
    if (heapAllocatedBytes != null) __obj.updateDynamic("heapAllocatedBytes")(heapAllocatedBytes.asInstanceOf[js.Any])
    if (heapAllocatedBytesDelta != null) __obj.updateDynamic("heapAllocatedBytesDelta")(heapAllocatedBytesDelta.asInstanceOf[js.Any])
    if (heapAllocatedObjects != null) __obj.updateDynamic("heapAllocatedObjects")(heapAllocatedObjects.asInstanceOf[js.Any])
    if (heapAllocatedObjectsDelta != null) __obj.updateDynamic("heapAllocatedObjectsDelta")(heapAllocatedObjectsDelta.asInstanceOf[js.Any])
    if (heapBytes != null) __obj.updateDynamic("heapBytes")(heapBytes.asInstanceOf[js.Any])
    if (heapFreedObjectsDelta != null) __obj.updateDynamic("heapFreedObjectsDelta")(heapFreedObjectsDelta.asInstanceOf[js.Any])
    if (heapReleasedBytes != null) __obj.updateDynamic("heapReleasedBytes")(heapReleasedBytes.asInstanceOf[js.Any])
    if (stackBytes != null) __obj.updateDynamic("stackBytes")(stackBytes.asInstanceOf[js.Any])
    if (stackUsedBytes != null) __obj.updateDynamic("stackUsedBytes")(stackUsedBytes.asInstanceOf[js.Any])
    if (totalBytes != null) __obj.updateDynamic("totalBytes")(totalBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMemStats]
  }
}


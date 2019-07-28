package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMemStats extends js.Object {
  /** MemStats gcCountDelta */
  var gcCountDelta: js.UndefOr[Double | Null] = js.undefined
  /** MemStats gcOverheadBytes */
  var gcOverheadBytes: js.UndefOr[Double | Null] = js.undefined
  /** MemStats gcStwNsDelta */
  var gcStwNsDelta: js.UndefOr[Double | Null] = js.undefined
  /** MemStats heapAllocatedBytes */
  var heapAllocatedBytes: js.UndefOr[Double | Null] = js.undefined
  /** MemStats heapAllocatedBytesDelta */
  var heapAllocatedBytesDelta: js.UndefOr[Double | Null] = js.undefined
  /** MemStats heapAllocatedObjects */
  var heapAllocatedObjects: js.UndefOr[Double | Null] = js.undefined
  /** MemStats heapAllocatedObjectsDelta */
  var heapAllocatedObjectsDelta: js.UndefOr[Double | Null] = js.undefined
  /** MemStats heapBytes */
  var heapBytes: js.UndefOr[Double | Null] = js.undefined
  /** MemStats heapFreedObjectsDelta */
  var heapFreedObjectsDelta: js.UndefOr[Double | Null] = js.undefined
  /** MemStats heapReleasedBytes */
  var heapReleasedBytes: js.UndefOr[Double | Null] = js.undefined
  /** MemStats stackBytes */
  var stackBytes: js.UndefOr[Double | Null] = js.undefined
  /** MemStats stackUsedBytes */
  var stackUsedBytes: js.UndefOr[Double | Null] = js.undefined
  /** MemStats totalBytes */
  var totalBytes: js.UndefOr[Double | Null] = js.undefined
}

object IMemStats {
  @scala.inline
  def apply(
    gcCountDelta: Int | Double = null,
    gcOverheadBytes: Int | Double = null,
    gcStwNsDelta: Int | Double = null,
    heapAllocatedBytes: Int | Double = null,
    heapAllocatedBytesDelta: Int | Double = null,
    heapAllocatedObjects: Int | Double = null,
    heapAllocatedObjectsDelta: Int | Double = null,
    heapBytes: Int | Double = null,
    heapFreedObjectsDelta: Int | Double = null,
    heapReleasedBytes: Int | Double = null,
    stackBytes: Int | Double = null,
    stackUsedBytes: Int | Double = null,
    totalBytes: Int | Double = null
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


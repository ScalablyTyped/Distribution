package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTPstat extends js.Object {
  /**
    * The Asterisk channels unique ID that owns this instance.
    */
  var channel_uniqueid: String
  /**
    * Maximum jitter on local side.
    */
  var local_maxjitter: js.UndefOr[Double] = js.undefined
  /**
    * Maximum number of packets lost on local side.
    */
  var local_maxrxploss: js.UndefOr[Double] = js.undefined
  /**
    * Minimum jitter on local side.
    */
  var local_minjitter: js.UndefOr[Double] = js.undefined
  /**
    * Minimum number of packets lost on local side.
    */
  var local_minrxploss: js.UndefOr[Double] = js.undefined
  /**
    * Average jitter on local side.
    */
  var local_normdevjitter: js.UndefOr[Double] = js.undefined
  /**
    * Average number of packets lost on local side.
    */
  var local_normdevrxploss: js.UndefOr[Double] = js.undefined
  /**
    * Our SSRC.
    */
  var local_ssrc: Double
  /**
    * Standard deviation jitter on local side.
    */
  var local_stdevjitter: js.UndefOr[Double] = js.undefined
  /**
    * Standard deviation packets lost on local side.
    */
  var local_stdevrxploss: js.UndefOr[Double] = js.undefined
  /**
    * Maximum round trip time.
    */
  var maxrtt: js.UndefOr[Double] = js.undefined
  /**
    * Minimum round trip time.
    */
  var minrtt: js.UndefOr[Double] = js.undefined
  /**
    * Average round trip time.
    */
  var normdevrtt: js.UndefOr[Double] = js.undefined
  /**
    * Maximum jitter on remote side.
    */
  var remote_maxjitter: js.UndefOr[Double] = js.undefined
  /**
    * Maximum number of packets lost on remote side.
    */
  var remote_maxrxploss: js.UndefOr[Double] = js.undefined
  /**
    * Minimum jitter on remote side.
    */
  var remote_minjitter: js.UndefOr[Double] = js.undefined
  /**
    * Minimum number of packets lost on remote side.
    */
  var remote_minrxploss: js.UndefOr[Double] = js.undefined
  /**
    * Average jitter on remote side.
    */
  var remote_normdevjitter: js.UndefOr[Double] = js.undefined
  /**
    * Average number of packets lost on remote side.
    */
  var remote_normdevrxploss: js.UndefOr[Double] = js.undefined
  /**
    * Their SSRC.
    */
  var remote_ssrc: Double
  /**
    * Standard deviation jitter on remote side.
    */
  var remote_stdevjitter: js.UndefOr[Double] = js.undefined
  /**
    * Standard deviation packets lost on remote side.
    */
  var remote_stdevrxploss: js.UndefOr[Double] = js.undefined
  /**
    * Total round trip time.
    */
  var rtt: js.UndefOr[Double] = js.undefined
  /**
    * Number of packets received.
    */
  var rxcount: Double
  /**
    * Jitter on received packets.
    */
  var rxjitter: js.UndefOr[Double] = js.undefined
  /**
    * Number of octets received.
    */
  var rxoctetcount: Double
  /**
    * Number of received packets lost.
    */
  var rxploss: Double
  /**
    * Standard deviation round trip time.
    */
  var stdevrtt: js.UndefOr[Double] = js.undefined
  /**
    * Number of packets transmitted.
    */
  var txcount: Double
  /**
    * Jitter on transmitted packets.
    */
  var txjitter: js.UndefOr[Double] = js.undefined
  /**
    * Number of octets transmitted.
    */
  var txoctetcount: Double
  /**
    * Number of transmitted packets lost.
    */
  var txploss: Double
}

object RTPstat {
  @scala.inline
  def apply(
    channel_uniqueid: String,
    local_ssrc: Double,
    remote_ssrc: Double,
    rxcount: Double,
    rxoctetcount: Double,
    rxploss: Double,
    txcount: Double,
    txoctetcount: Double,
    txploss: Double,
    local_maxjitter: js.UndefOr[Double] = js.undefined,
    local_maxrxploss: js.UndefOr[Double] = js.undefined,
    local_minjitter: js.UndefOr[Double] = js.undefined,
    local_minrxploss: js.UndefOr[Double] = js.undefined,
    local_normdevjitter: js.UndefOr[Double] = js.undefined,
    local_normdevrxploss: js.UndefOr[Double] = js.undefined,
    local_stdevjitter: js.UndefOr[Double] = js.undefined,
    local_stdevrxploss: js.UndefOr[Double] = js.undefined,
    maxrtt: js.UndefOr[Double] = js.undefined,
    minrtt: js.UndefOr[Double] = js.undefined,
    normdevrtt: js.UndefOr[Double] = js.undefined,
    remote_maxjitter: js.UndefOr[Double] = js.undefined,
    remote_maxrxploss: js.UndefOr[Double] = js.undefined,
    remote_minjitter: js.UndefOr[Double] = js.undefined,
    remote_minrxploss: js.UndefOr[Double] = js.undefined,
    remote_normdevjitter: js.UndefOr[Double] = js.undefined,
    remote_normdevrxploss: js.UndefOr[Double] = js.undefined,
    remote_stdevjitter: js.UndefOr[Double] = js.undefined,
    remote_stdevrxploss: js.UndefOr[Double] = js.undefined,
    rtt: js.UndefOr[Double] = js.undefined,
    rxjitter: js.UndefOr[Double] = js.undefined,
    stdevrtt: js.UndefOr[Double] = js.undefined,
    txjitter: js.UndefOr[Double] = js.undefined
  ): RTPstat = {
    val __obj = js.Dynamic.literal(channel_uniqueid = channel_uniqueid.asInstanceOf[js.Any], local_ssrc = local_ssrc.asInstanceOf[js.Any], remote_ssrc = remote_ssrc.asInstanceOf[js.Any], rxcount = rxcount.asInstanceOf[js.Any], rxoctetcount = rxoctetcount.asInstanceOf[js.Any], rxploss = rxploss.asInstanceOf[js.Any], txcount = txcount.asInstanceOf[js.Any], txoctetcount = txoctetcount.asInstanceOf[js.Any], txploss = txploss.asInstanceOf[js.Any])
    if (!js.isUndefined(local_maxjitter)) __obj.updateDynamic("local_maxjitter")(local_maxjitter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(local_maxrxploss)) __obj.updateDynamic("local_maxrxploss")(local_maxrxploss.get.asInstanceOf[js.Any])
    if (!js.isUndefined(local_minjitter)) __obj.updateDynamic("local_minjitter")(local_minjitter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(local_minrxploss)) __obj.updateDynamic("local_minrxploss")(local_minrxploss.get.asInstanceOf[js.Any])
    if (!js.isUndefined(local_normdevjitter)) __obj.updateDynamic("local_normdevjitter")(local_normdevjitter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(local_normdevrxploss)) __obj.updateDynamic("local_normdevrxploss")(local_normdevrxploss.get.asInstanceOf[js.Any])
    if (!js.isUndefined(local_stdevjitter)) __obj.updateDynamic("local_stdevjitter")(local_stdevjitter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(local_stdevrxploss)) __obj.updateDynamic("local_stdevrxploss")(local_stdevrxploss.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxrtt)) __obj.updateDynamic("maxrtt")(maxrtt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minrtt)) __obj.updateDynamic("minrtt")(minrtt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(normdevrtt)) __obj.updateDynamic("normdevrtt")(normdevrtt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remote_maxjitter)) __obj.updateDynamic("remote_maxjitter")(remote_maxjitter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remote_maxrxploss)) __obj.updateDynamic("remote_maxrxploss")(remote_maxrxploss.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remote_minjitter)) __obj.updateDynamic("remote_minjitter")(remote_minjitter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remote_minrxploss)) __obj.updateDynamic("remote_minrxploss")(remote_minrxploss.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remote_normdevjitter)) __obj.updateDynamic("remote_normdevjitter")(remote_normdevjitter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remote_normdevrxploss)) __obj.updateDynamic("remote_normdevrxploss")(remote_normdevrxploss.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remote_stdevjitter)) __obj.updateDynamic("remote_stdevjitter")(remote_stdevjitter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remote_stdevrxploss)) __obj.updateDynamic("remote_stdevrxploss")(remote_stdevrxploss.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rtt)) __obj.updateDynamic("rtt")(rtt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rxjitter)) __obj.updateDynamic("rxjitter")(rxjitter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stdevrtt)) __obj.updateDynamic("stdevrtt")(stdevrtt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(txjitter)) __obj.updateDynamic("txjitter")(txjitter.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTPstat]
  }
}


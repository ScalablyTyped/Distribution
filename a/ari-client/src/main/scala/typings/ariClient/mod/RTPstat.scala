package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTPstat extends js.Object {
  
  /**
    * The Asterisk channels unique ID that owns this instance.
    */
  var channel_uniqueid: String = js.native
  
  /**
    * Maximum jitter on local side.
    */
  var local_maxjitter: js.UndefOr[Double] = js.native
  
  /**
    * Maximum number of packets lost on local side.
    */
  var local_maxrxploss: js.UndefOr[Double] = js.native
  
  /**
    * Minimum jitter on local side.
    */
  var local_minjitter: js.UndefOr[Double] = js.native
  
  /**
    * Minimum number of packets lost on local side.
    */
  var local_minrxploss: js.UndefOr[Double] = js.native
  
  /**
    * Average jitter on local side.
    */
  var local_normdevjitter: js.UndefOr[Double] = js.native
  
  /**
    * Average number of packets lost on local side.
    */
  var local_normdevrxploss: js.UndefOr[Double] = js.native
  
  /**
    * Our SSRC.
    */
  var local_ssrc: Double = js.native
  
  /**
    * Standard deviation jitter on local side.
    */
  var local_stdevjitter: js.UndefOr[Double] = js.native
  
  /**
    * Standard deviation packets lost on local side.
    */
  var local_stdevrxploss: js.UndefOr[Double] = js.native
  
  /**
    * Maximum round trip time.
    */
  var maxrtt: js.UndefOr[Double] = js.native
  
  /**
    * Minimum round trip time.
    */
  var minrtt: js.UndefOr[Double] = js.native
  
  /**
    * Average round trip time.
    */
  var normdevrtt: js.UndefOr[Double] = js.native
  
  /**
    * Maximum jitter on remote side.
    */
  var remote_maxjitter: js.UndefOr[Double] = js.native
  
  /**
    * Maximum number of packets lost on remote side.
    */
  var remote_maxrxploss: js.UndefOr[Double] = js.native
  
  /**
    * Minimum jitter on remote side.
    */
  var remote_minjitter: js.UndefOr[Double] = js.native
  
  /**
    * Minimum number of packets lost on remote side.
    */
  var remote_minrxploss: js.UndefOr[Double] = js.native
  
  /**
    * Average jitter on remote side.
    */
  var remote_normdevjitter: js.UndefOr[Double] = js.native
  
  /**
    * Average number of packets lost on remote side.
    */
  var remote_normdevrxploss: js.UndefOr[Double] = js.native
  
  /**
    * Their SSRC.
    */
  var remote_ssrc: Double = js.native
  
  /**
    * Standard deviation jitter on remote side.
    */
  var remote_stdevjitter: js.UndefOr[Double] = js.native
  
  /**
    * Standard deviation packets lost on remote side.
    */
  var remote_stdevrxploss: js.UndefOr[Double] = js.native
  
  /**
    * Total round trip time.
    */
  var rtt: js.UndefOr[Double] = js.native
  
  /**
    * Number of packets received.
    */
  var rxcount: Double = js.native
  
  /**
    * Jitter on received packets.
    */
  var rxjitter: js.UndefOr[Double] = js.native
  
  /**
    * Number of octets received.
    */
  var rxoctetcount: Double = js.native
  
  /**
    * Number of received packets lost.
    */
  var rxploss: Double = js.native
  
  /**
    * Standard deviation round trip time.
    */
  var stdevrtt: js.UndefOr[Double] = js.native
  
  /**
    * Number of packets transmitted.
    */
  var txcount: Double = js.native
  
  /**
    * Jitter on transmitted packets.
    */
  var txjitter: js.UndefOr[Double] = js.native
  
  /**
    * Number of octets transmitted.
    */
  var txoctetcount: Double = js.native
  
  /**
    * Number of transmitted packets lost.
    */
  var txploss: Double = js.native
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
    txploss: Double
  ): RTPstat = {
    val __obj = js.Dynamic.literal(channel_uniqueid = channel_uniqueid.asInstanceOf[js.Any], local_ssrc = local_ssrc.asInstanceOf[js.Any], remote_ssrc = remote_ssrc.asInstanceOf[js.Any], rxcount = rxcount.asInstanceOf[js.Any], rxoctetcount = rxoctetcount.asInstanceOf[js.Any], rxploss = rxploss.asInstanceOf[js.Any], txcount = txcount.asInstanceOf[js.Any], txoctetcount = txoctetcount.asInstanceOf[js.Any], txploss = txploss.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTPstat]
  }
  
  @scala.inline
  implicit class RTPstatOps[Self <: RTPstat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannel_uniqueid(value: String): Self = this.set("channel_uniqueid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocal_ssrc(value: Double): Self = this.set("local_ssrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemote_ssrc(value: Double): Self = this.set("remote_ssrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRxcount(value: Double): Self = this.set("rxcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRxoctetcount(value: Double): Self = this.set("rxoctetcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRxploss(value: Double): Self = this.set("rxploss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxcount(value: Double): Self = this.set("txcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxoctetcount(value: Double): Self = this.set("txoctetcount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxploss(value: Double): Self = this.set("txploss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocal_maxjitter(value: Double): Self = this.set("local_maxjitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocal_maxjitter: Self = this.set("local_maxjitter", js.undefined)
    
    @scala.inline
    def setLocal_maxrxploss(value: Double): Self = this.set("local_maxrxploss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocal_maxrxploss: Self = this.set("local_maxrxploss", js.undefined)
    
    @scala.inline
    def setLocal_minjitter(value: Double): Self = this.set("local_minjitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocal_minjitter: Self = this.set("local_minjitter", js.undefined)
    
    @scala.inline
    def setLocal_minrxploss(value: Double): Self = this.set("local_minrxploss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocal_minrxploss: Self = this.set("local_minrxploss", js.undefined)
    
    @scala.inline
    def setLocal_normdevjitter(value: Double): Self = this.set("local_normdevjitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocal_normdevjitter: Self = this.set("local_normdevjitter", js.undefined)
    
    @scala.inline
    def setLocal_normdevrxploss(value: Double): Self = this.set("local_normdevrxploss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocal_normdevrxploss: Self = this.set("local_normdevrxploss", js.undefined)
    
    @scala.inline
    def setLocal_stdevjitter(value: Double): Self = this.set("local_stdevjitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocal_stdevjitter: Self = this.set("local_stdevjitter", js.undefined)
    
    @scala.inline
    def setLocal_stdevrxploss(value: Double): Self = this.set("local_stdevrxploss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocal_stdevrxploss: Self = this.set("local_stdevrxploss", js.undefined)
    
    @scala.inline
    def setMaxrtt(value: Double): Self = this.set("maxrtt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxrtt: Self = this.set("maxrtt", js.undefined)
    
    @scala.inline
    def setMinrtt(value: Double): Self = this.set("minrtt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinrtt: Self = this.set("minrtt", js.undefined)
    
    @scala.inline
    def setNormdevrtt(value: Double): Self = this.set("normdevrtt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormdevrtt: Self = this.set("normdevrtt", js.undefined)
    
    @scala.inline
    def setRemote_maxjitter(value: Double): Self = this.set("remote_maxjitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemote_maxjitter: Self = this.set("remote_maxjitter", js.undefined)
    
    @scala.inline
    def setRemote_maxrxploss(value: Double): Self = this.set("remote_maxrxploss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemote_maxrxploss: Self = this.set("remote_maxrxploss", js.undefined)
    
    @scala.inline
    def setRemote_minjitter(value: Double): Self = this.set("remote_minjitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemote_minjitter: Self = this.set("remote_minjitter", js.undefined)
    
    @scala.inline
    def setRemote_minrxploss(value: Double): Self = this.set("remote_minrxploss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemote_minrxploss: Self = this.set("remote_minrxploss", js.undefined)
    
    @scala.inline
    def setRemote_normdevjitter(value: Double): Self = this.set("remote_normdevjitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemote_normdevjitter: Self = this.set("remote_normdevjitter", js.undefined)
    
    @scala.inline
    def setRemote_normdevrxploss(value: Double): Self = this.set("remote_normdevrxploss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemote_normdevrxploss: Self = this.set("remote_normdevrxploss", js.undefined)
    
    @scala.inline
    def setRemote_stdevjitter(value: Double): Self = this.set("remote_stdevjitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemote_stdevjitter: Self = this.set("remote_stdevjitter", js.undefined)
    
    @scala.inline
    def setRemote_stdevrxploss(value: Double): Self = this.set("remote_stdevrxploss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemote_stdevrxploss: Self = this.set("remote_stdevrxploss", js.undefined)
    
    @scala.inline
    def setRtt(value: Double): Self = this.set("rtt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtt: Self = this.set("rtt", js.undefined)
    
    @scala.inline
    def setRxjitter(value: Double): Self = this.set("rxjitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRxjitter: Self = this.set("rxjitter", js.undefined)
    
    @scala.inline
    def setStdevrtt(value: Double): Self = this.set("stdevrtt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdevrtt: Self = this.set("stdevrtt", js.undefined)
    
    @scala.inline
    def setTxjitter(value: Double): Self = this.set("txjitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTxjitter: Self = this.set("txjitter", js.undefined)
  }
}

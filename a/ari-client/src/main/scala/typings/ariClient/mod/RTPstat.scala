package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTPstat extends StObject {
  
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
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: RTPstat] (val x: Self) extends AnyVal {
    
    inline def setChannel_uniqueid(value: String): Self = StObject.set(x, "channel_uniqueid", value.asInstanceOf[js.Any])
    
    inline def setLocal_maxjitter(value: Double): Self = StObject.set(x, "local_maxjitter", value.asInstanceOf[js.Any])
    
    inline def setLocal_maxjitterUndefined: Self = StObject.set(x, "local_maxjitter", js.undefined)
    
    inline def setLocal_maxrxploss(value: Double): Self = StObject.set(x, "local_maxrxploss", value.asInstanceOf[js.Any])
    
    inline def setLocal_maxrxplossUndefined: Self = StObject.set(x, "local_maxrxploss", js.undefined)
    
    inline def setLocal_minjitter(value: Double): Self = StObject.set(x, "local_minjitter", value.asInstanceOf[js.Any])
    
    inline def setLocal_minjitterUndefined: Self = StObject.set(x, "local_minjitter", js.undefined)
    
    inline def setLocal_minrxploss(value: Double): Self = StObject.set(x, "local_minrxploss", value.asInstanceOf[js.Any])
    
    inline def setLocal_minrxplossUndefined: Self = StObject.set(x, "local_minrxploss", js.undefined)
    
    inline def setLocal_normdevjitter(value: Double): Self = StObject.set(x, "local_normdevjitter", value.asInstanceOf[js.Any])
    
    inline def setLocal_normdevjitterUndefined: Self = StObject.set(x, "local_normdevjitter", js.undefined)
    
    inline def setLocal_normdevrxploss(value: Double): Self = StObject.set(x, "local_normdevrxploss", value.asInstanceOf[js.Any])
    
    inline def setLocal_normdevrxplossUndefined: Self = StObject.set(x, "local_normdevrxploss", js.undefined)
    
    inline def setLocal_ssrc(value: Double): Self = StObject.set(x, "local_ssrc", value.asInstanceOf[js.Any])
    
    inline def setLocal_stdevjitter(value: Double): Self = StObject.set(x, "local_stdevjitter", value.asInstanceOf[js.Any])
    
    inline def setLocal_stdevjitterUndefined: Self = StObject.set(x, "local_stdevjitter", js.undefined)
    
    inline def setLocal_stdevrxploss(value: Double): Self = StObject.set(x, "local_stdevrxploss", value.asInstanceOf[js.Any])
    
    inline def setLocal_stdevrxplossUndefined: Self = StObject.set(x, "local_stdevrxploss", js.undefined)
    
    inline def setMaxrtt(value: Double): Self = StObject.set(x, "maxrtt", value.asInstanceOf[js.Any])
    
    inline def setMaxrttUndefined: Self = StObject.set(x, "maxrtt", js.undefined)
    
    inline def setMinrtt(value: Double): Self = StObject.set(x, "minrtt", value.asInstanceOf[js.Any])
    
    inline def setMinrttUndefined: Self = StObject.set(x, "minrtt", js.undefined)
    
    inline def setNormdevrtt(value: Double): Self = StObject.set(x, "normdevrtt", value.asInstanceOf[js.Any])
    
    inline def setNormdevrttUndefined: Self = StObject.set(x, "normdevrtt", js.undefined)
    
    inline def setRemote_maxjitter(value: Double): Self = StObject.set(x, "remote_maxjitter", value.asInstanceOf[js.Any])
    
    inline def setRemote_maxjitterUndefined: Self = StObject.set(x, "remote_maxjitter", js.undefined)
    
    inline def setRemote_maxrxploss(value: Double): Self = StObject.set(x, "remote_maxrxploss", value.asInstanceOf[js.Any])
    
    inline def setRemote_maxrxplossUndefined: Self = StObject.set(x, "remote_maxrxploss", js.undefined)
    
    inline def setRemote_minjitter(value: Double): Self = StObject.set(x, "remote_minjitter", value.asInstanceOf[js.Any])
    
    inline def setRemote_minjitterUndefined: Self = StObject.set(x, "remote_minjitter", js.undefined)
    
    inline def setRemote_minrxploss(value: Double): Self = StObject.set(x, "remote_minrxploss", value.asInstanceOf[js.Any])
    
    inline def setRemote_minrxplossUndefined: Self = StObject.set(x, "remote_minrxploss", js.undefined)
    
    inline def setRemote_normdevjitter(value: Double): Self = StObject.set(x, "remote_normdevjitter", value.asInstanceOf[js.Any])
    
    inline def setRemote_normdevjitterUndefined: Self = StObject.set(x, "remote_normdevjitter", js.undefined)
    
    inline def setRemote_normdevrxploss(value: Double): Self = StObject.set(x, "remote_normdevrxploss", value.asInstanceOf[js.Any])
    
    inline def setRemote_normdevrxplossUndefined: Self = StObject.set(x, "remote_normdevrxploss", js.undefined)
    
    inline def setRemote_ssrc(value: Double): Self = StObject.set(x, "remote_ssrc", value.asInstanceOf[js.Any])
    
    inline def setRemote_stdevjitter(value: Double): Self = StObject.set(x, "remote_stdevjitter", value.asInstanceOf[js.Any])
    
    inline def setRemote_stdevjitterUndefined: Self = StObject.set(x, "remote_stdevjitter", js.undefined)
    
    inline def setRemote_stdevrxploss(value: Double): Self = StObject.set(x, "remote_stdevrxploss", value.asInstanceOf[js.Any])
    
    inline def setRemote_stdevrxplossUndefined: Self = StObject.set(x, "remote_stdevrxploss", js.undefined)
    
    inline def setRtt(value: Double): Self = StObject.set(x, "rtt", value.asInstanceOf[js.Any])
    
    inline def setRttUndefined: Self = StObject.set(x, "rtt", js.undefined)
    
    inline def setRxcount(value: Double): Self = StObject.set(x, "rxcount", value.asInstanceOf[js.Any])
    
    inline def setRxjitter(value: Double): Self = StObject.set(x, "rxjitter", value.asInstanceOf[js.Any])
    
    inline def setRxjitterUndefined: Self = StObject.set(x, "rxjitter", js.undefined)
    
    inline def setRxoctetcount(value: Double): Self = StObject.set(x, "rxoctetcount", value.asInstanceOf[js.Any])
    
    inline def setRxploss(value: Double): Self = StObject.set(x, "rxploss", value.asInstanceOf[js.Any])
    
    inline def setStdevrtt(value: Double): Self = StObject.set(x, "stdevrtt", value.asInstanceOf[js.Any])
    
    inline def setStdevrttUndefined: Self = StObject.set(x, "stdevrtt", js.undefined)
    
    inline def setTxcount(value: Double): Self = StObject.set(x, "txcount", value.asInstanceOf[js.Any])
    
    inline def setTxjitter(value: Double): Self = StObject.set(x, "txjitter", value.asInstanceOf[js.Any])
    
    inline def setTxjitterUndefined: Self = StObject.set(x, "txjitter", js.undefined)
    
    inline def setTxoctetcount(value: Double): Self = StObject.set(x, "txoctetcount", value.asInstanceOf[js.Any])
    
    inline def setTxploss(value: Double): Self = StObject.set(x, "txploss", value.asInstanceOf[js.Any])
  }
}

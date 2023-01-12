package typings.applestAtem

import org.scalablytyped.runtime.NumberDictionary
import typings.applestAtem.applestAtemStrings.connect
import typings.applestAtem.applestAtemStrings.disconnect
import typings.applestAtem.applestAtemStrings.ping
import typings.applestAtem.applestAtemStrings.stateChanged
import typings.applestAtem.mod.AudioChannel
import typings.applestAtem.mod.AuxChannelNumber
import typings.applestAtem.mod.MixEffectState
import typings.applestAtem.mod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Auxs extends StObject {
    
    var ME: NumberDictionary[MixEffectState]
    
    var auxs: NumberDictionary[AuxChannelNumber]
    
    var downstreamKeyOn: NumberDictionary[Boolean]
    
    var downstreamKeyTie: NumberDictionary[Boolean]
  }
  object Auxs {
    
    inline def apply(
      ME: NumberDictionary[MixEffectState],
      auxs: NumberDictionary[AuxChannelNumber],
      downstreamKeyOn: NumberDictionary[Boolean],
      downstreamKeyTie: NumberDictionary[Boolean]
    ): Auxs = {
      val __obj = js.Dynamic.literal(ME = ME.asInstanceOf[js.Any], auxs = auxs.asInstanceOf[js.Any], downstreamKeyOn = downstreamKeyOn.asInstanceOf[js.Any], downstreamKeyTie = downstreamKeyTie.asInstanceOf[js.Any])
      __obj.asInstanceOf[Auxs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Auxs] (val x: Self) extends AnyVal {
      
      inline def setAuxs(value: NumberDictionary[AuxChannelNumber]): Self = StObject.set(x, "auxs", value.asInstanceOf[js.Any])
      
      inline def setDownstreamKeyOn(value: NumberDictionary[Boolean]): Self = StObject.set(x, "downstreamKeyOn", value.asInstanceOf[js.Any])
      
      inline def setDownstreamKeyTie(value: NumberDictionary[Boolean]): Self = StObject.set(x, "downstreamKeyTie", value.asInstanceOf[js.Any])
      
      inline def setME(value: NumberDictionary[MixEffectState]): Self = StObject.set(x, "ME", value.asInstanceOf[js.Any])
    }
  }
  
  trait Channels extends StObject {
    
    var channels: NumberDictionary[AudioChannel]
    
    /** whether the mixer has a physical 3.5mm jack for monitoring audio */
    var hasMonitor: Boolean | Null
    
    var master: js.UndefOr[AudioChannel] = js.undefined
    
    var numberOfChannels: Double | Null
  }
  object Channels {
    
    inline def apply(channels: NumberDictionary[AudioChannel]): Channels = {
      val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], hasMonitor = null, numberOfChannels = null)
      __obj.asInstanceOf[Channels]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Channels] (val x: Self) extends AnyVal {
      
      inline def setChannels(value: NumberDictionary[AudioChannel]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      inline def setHasMonitor(value: Boolean): Self = StObject.set(x, "hasMonitor", value.asInstanceOf[js.Any])
      
      inline def setHasMonitorNull: Self = StObject.set(x, "hasMonitor", null)
      
      inline def setMaster(value: AudioChannel): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
      
      inline def setMasterUndefined: Self = StObject.set(x, "master", js.undefined)
      
      inline def setNumberOfChannels(value: Double): Self = StObject.set(x, "numberOfChannels", value.asInstanceOf[js.Any])
      
      inline def setNumberOfChannelsNull: Self = StObject.set(x, "numberOfChannels", null)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(event: connect, callback: js.Function1[/* error */ Null, Unit]): Unit = js.native
    def apply(event: disconnect, callback: js.Function2[/* error */ Null, /* state */ Null, Unit]): Unit = js.native
    def apply(event: ping, callback: js.Function0[Unit]): Unit = js.native
    def apply(
      event: stateChanged,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* state */ js.UndefOr[State], Unit]
    ): Unit = js.native
  }
  
  trait NumberOfAUXs extends StObject {
    
    var numberOfAUXs: Double | Null
    
    var numberOfColorGenerators: Double | Null
    
    var numberOfDVEs: Double | Null
    
    var numberOfDownstreamKeys: Double | Null
    
    var numberOfMEs: Double | Null
    
    var numberOfSources: Double | Null
    
    var numberOfStingers: Double | Null
    
    var numberOfSuperSources: Double | Null
  }
  object NumberOfAUXs {
    
    inline def apply(): NumberOfAUXs = {
      val __obj = js.Dynamic.literal(numberOfAUXs = null, numberOfColorGenerators = null, numberOfDVEs = null, numberOfDownstreamKeys = null, numberOfMEs = null, numberOfSources = null, numberOfStingers = null, numberOfSuperSources = null)
      __obj.asInstanceOf[NumberOfAUXs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NumberOfAUXs] (val x: Self) extends AnyVal {
      
      inline def setNumberOfAUXs(value: Double): Self = StObject.set(x, "numberOfAUXs", value.asInstanceOf[js.Any])
      
      inline def setNumberOfAUXsNull: Self = StObject.set(x, "numberOfAUXs", null)
      
      inline def setNumberOfColorGenerators(value: Double): Self = StObject.set(x, "numberOfColorGenerators", value.asInstanceOf[js.Any])
      
      inline def setNumberOfColorGeneratorsNull: Self = StObject.set(x, "numberOfColorGenerators", null)
      
      inline def setNumberOfDVEs(value: Double): Self = StObject.set(x, "numberOfDVEs", value.asInstanceOf[js.Any])
      
      inline def setNumberOfDVEsNull: Self = StObject.set(x, "numberOfDVEs", null)
      
      inline def setNumberOfDownstreamKeys(value: Double): Self = StObject.set(x, "numberOfDownstreamKeys", value.asInstanceOf[js.Any])
      
      inline def setNumberOfDownstreamKeysNull: Self = StObject.set(x, "numberOfDownstreamKeys", null)
      
      inline def setNumberOfMEs(value: Double): Self = StObject.set(x, "numberOfMEs", value.asInstanceOf[js.Any])
      
      inline def setNumberOfMEsNull: Self = StObject.set(x, "numberOfMEs", null)
      
      inline def setNumberOfSources(value: Double): Self = StObject.set(x, "numberOfSources", value.asInstanceOf[js.Any])
      
      inline def setNumberOfSourcesNull: Self = StObject.set(x, "numberOfSources", null)
      
      inline def setNumberOfStingers(value: Double): Self = StObject.set(x, "numberOfStingers", value.asInstanceOf[js.Any])
      
      inline def setNumberOfStingersNull: Self = StObject.set(x, "numberOfStingers", null)
      
      inline def setNumberOfSuperSources(value: Double): Self = StObject.set(x, "numberOfSuperSources", value.asInstanceOf[js.Any])
      
      inline def setNumberOfSuperSourcesNull: Self = StObject.set(x, "numberOfSuperSources", null)
    }
  }
}

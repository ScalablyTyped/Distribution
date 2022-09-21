package typings.atvlegacycontentkit.atv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Player related callbacks and functions. Please note, this is only available in application level contexts.
  */
object player {
  
  @js.native
  sealed trait events extends StObject
  /**
    * Specific events for the player. Usually triggered by the remote;
    */
  @JSGlobal("atv.player.events")
  @js.native
  object events extends StObject {
    
    /**
      * A fast forward has been requested.
      */
    @js.native
    sealed trait FFwd
      extends StObject
         with events
    
    /**
      * A pause has been requested.
      */
    @js.native
    sealed trait Pause
      extends StObject
         with events
    
    /**
      * A play has been requested.
      */
    @js.native
    sealed trait Play
      extends StObject
         with events
    
    /**
      * A rewind has been requested.
      */
    @js.native
    sealed trait Rew
      extends StObject
         with events
    
    /**
      * A skip forward has been requested.
      */
    @js.native
    sealed trait SkipFwd
      extends StObject
         with events
    
    /**
      * A skip back has been requested
      */
    @js.native
    sealed trait SwipBack
      extends StObject
         with events
  }
  
  @js.native
  sealed trait states extends StObject
  /**
    * The different states that the player can have.
    */
  @JSGlobal("atv.player.states")
  @js.native
  object states extends StObject {
    
    /**
      * The player is currently fast forwarding.
      */
    @js.native
    sealed trait FastForwarding
      extends StObject
         with states
    
    /**
      * The player is currently buffering.
      */
    @js.native
    sealed trait Loading
      extends StObject
         with states
    
    /**
      * The player is currently paused.
      */
    @js.native
    sealed trait Paused
      extends StObject
         with states
    
    /**
      * The player is currently playing.
      */
    @js.native
    sealed trait Playing
      extends StObject
         with states
    
    /**
      * The player is currently rewinding.
      */
    @js.native
    sealed trait Rewinding
      extends StObject
         with states
    
    /**
      * The player is currently stopped.
      */
    @js.native
    sealed trait Stopped
      extends StObject
         with states
  }
}

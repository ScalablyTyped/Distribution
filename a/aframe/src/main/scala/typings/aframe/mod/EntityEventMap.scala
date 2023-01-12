package typings.aframe.mod

import typings.aframe.anon.ComponentName
import typings.aframe.anon.Data
import typings.aframe.anon.El
import typings.aframe.anon.Id
import typings.aframe.anon.Name
import typings.aframe.anon.State
import typings.std.Event
import typings.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityEventMap extends StObject {
  
  var `child-attached`: DetailEvent[El]
  
  var `child-detached`: DetailEvent[El]
  
  var componentchanged: DetailEvent[Id]
  
  var componentinitialized: DetailEvent[Data]
  
  var componentremoved: DetailEvent[Name]
  
  def loaded(evt: Event): Unit
  @JSName("loaded")
  var loaded_Original: EventListener
  
  def pause(evt: Event): Unit
  @JSName("pause")
  var pause_Original: EventListener
  
  def play(evt: Event): Unit
  @JSName("play")
  var play_Original: EventListener
  
  var schemachanged: DetailEvent[ComponentName]
  
  var stateadded: DetailEvent[State]
  
  var stateremoved: DetailEvent[State]
}
object EntityEventMap {
  
  inline def apply(
    `child-attached`: DetailEvent[El],
    `child-detached`: DetailEvent[El],
    componentchanged: DetailEvent[Id],
    componentinitialized: DetailEvent[Data],
    componentremoved: DetailEvent[Name],
    loaded: /* evt */ Event => Unit,
    pause: /* evt */ Event => Unit,
    play: /* evt */ Event => Unit,
    schemachanged: DetailEvent[ComponentName],
    stateadded: DetailEvent[State],
    stateremoved: DetailEvent[State]
  ): EntityEventMap = {
    val __obj = js.Dynamic.literal(componentchanged = componentchanged.asInstanceOf[js.Any], componentinitialized = componentinitialized.asInstanceOf[js.Any], componentremoved = componentremoved.asInstanceOf[js.Any], loaded = js.Any.fromFunction1(loaded), pause = js.Any.fromFunction1(pause), play = js.Any.fromFunction1(play), schemachanged = schemachanged.asInstanceOf[js.Any], stateadded = stateadded.asInstanceOf[js.Any], stateremoved = stateremoved.asInstanceOf[js.Any])
    __obj.updateDynamic("child-attached")(`child-attached`.asInstanceOf[js.Any])
    __obj.updateDynamic("child-detached")(`child-detached`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntityEventMap] (val x: Self) extends AnyVal {
    
    inline def `setChild-attached`(value: DetailEvent[El]): Self = StObject.set(x, "child-attached", value.asInstanceOf[js.Any])
    
    inline def `setChild-detached`(value: DetailEvent[El]): Self = StObject.set(x, "child-detached", value.asInstanceOf[js.Any])
    
    inline def setComponentchanged(value: DetailEvent[Id]): Self = StObject.set(x, "componentchanged", value.asInstanceOf[js.Any])
    
    inline def setComponentinitialized(value: DetailEvent[Data]): Self = StObject.set(x, "componentinitialized", value.asInstanceOf[js.Any])
    
    inline def setComponentremoved(value: DetailEvent[Name]): Self = StObject.set(x, "componentremoved", value.asInstanceOf[js.Any])
    
    inline def setLoaded(value: /* evt */ Event => Unit): Self = StObject.set(x, "loaded", js.Any.fromFunction1(value))
    
    inline def setPause(value: /* evt */ Event => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction1(value))
    
    inline def setPlay(value: /* evt */ Event => Unit): Self = StObject.set(x, "play", js.Any.fromFunction1(value))
    
    inline def setSchemachanged(value: DetailEvent[ComponentName]): Self = StObject.set(x, "schemachanged", value.asInstanceOf[js.Any])
    
    inline def setStateadded(value: DetailEvent[State]): Self = StObject.set(x, "stateadded", value.asInstanceOf[js.Any])
    
    inline def setStateremoved(value: DetailEvent[State]): Self = StObject.set(x, "stateremoved", value.asInstanceOf[js.Any])
  }
}

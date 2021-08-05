package typings.atomKeymap

import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Command extends StObject {
    
    // e.g. 'ctrl-x ctrl-s'
    var command: js.UndefOr[String] = js.undefined
    
    var keystrokes: js.UndefOr[String] = js.undefined
    
    // e.g. 'editor:backspace'
    var target: js.UndefOr[Element] = js.undefined
  }
  object Command {
    
    inline def apply(): Command = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Command]
    }
    
    extension [Self <: Command](x: Self) {
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
      
      inline def setKeystrokes(value: String): Self = StObject.set(x, "keystrokes", value.asInstanceOf[js.Any])
      
      inline def setKeystrokesUndefined: Self = StObject.set(x, "keystrokes", js.undefined)
      
      inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait DefaultTarget extends StObject {
    
    var defaultTarget: js.UndefOr[HTMLElement] = js.undefined
  }
  object DefaultTarget {
    
    inline def apply(): DefaultTarget = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultTarget]
    }
    
    extension [Self <: DefaultTarget](x: Self) {
      
      inline def setDefaultTarget(value: HTMLElement): Self = StObject.set(x, "defaultTarget", value.asInstanceOf[js.Any])
      
      inline def setDefaultTargetUndefined: Self = StObject.set(x, "defaultTarget", js.undefined)
    }
  }
  
  trait Priority extends StObject {
    
    var priority: js.UndefOr[Double] = js.undefined
    
    var watch: js.UndefOr[Boolean] = js.undefined
  }
  object Priority {
    
    inline def apply(): Priority = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Priority]
    }
    
    extension [Self <: Priority](x: Self) {
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
  
  trait PriorityNumber extends StObject {
    
    var priority: Double
  }
  object PriorityNumber {
    
    inline def apply(priority: Double): PriorityNumber = {
      val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
      __obj.asInstanceOf[PriorityNumber]
    }
    
    extension [Self <: PriorityNumber](x: Self) {
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    }
  }
}

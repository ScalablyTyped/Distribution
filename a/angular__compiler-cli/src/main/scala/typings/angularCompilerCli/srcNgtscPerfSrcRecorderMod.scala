package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscPerfSrcApiMod.PerfRecorder
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscPerfSrcRecorderMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/perf/src/recorder", "ActivePerfRecorder")
  @js.native
  /* private */ open class ActivePerfRecorder ()
    extends StObject
       with PerfRecorder {
    
    /* private */ var bytes: Any = js.native
    
    /* private */ var counters: Any = js.native
    
    /* private */ var currentPhase: Any = js.native
    
    /* private */ var currentPhaseEntered: Any = js.native
    
    /* private */ var phaseTime: Any = js.native
    
    /* private */ var zeroTime: Any = js.native
  }
  /* static members */
  object ActivePerfRecorder {
    
    @JSImport("@angular/compiler-cli/src/ngtsc/perf/src/recorder", "ActivePerfRecorder")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an `ActivePerfRecorder` with its zero point set to the current time.
      */
    inline def zeroedToNow(): ActivePerfRecorder = ^.asInstanceOf[js.Dynamic].applyDynamic("zeroedToNow")().asInstanceOf[ActivePerfRecorder]
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/perf/src/recorder", "DelegatingPerfRecorder")
  @js.native
  open class DelegatingPerfRecorder protected ()
    extends StObject
       with PerfRecorder {
    def this(target: PerfRecorder) = this()
    
    var target: PerfRecorder = js.native
  }
  
  trait PerfResults extends StObject {
    
    var events: Record[String, Double]
    
    var memory: Record[String, Double]
    
    var phases: Record[String, Double]
  }
  object PerfResults {
    
    inline def apply(events: Record[String, Double], memory: Record[String, Double], phases: Record[String, Double]): PerfResults = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], phases = phases.asInstanceOf[js.Any])
      __obj.asInstanceOf[PerfResults]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PerfResults] (val x: Self) extends AnyVal {
      
      inline def setEvents(value: Record[String, Double]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setMemory(value: Record[String, Double]): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      inline def setPhases(value: Record[String, Double]): Self = StObject.set(x, "phases", value.asInstanceOf[js.Any])
    }
  }
}

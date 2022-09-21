package typings.ackeeTracker

import typings.ackeeTracker.ackeeTrackerBooleans.`false`
import typings.ackeeTracker.ackeeTrackerBooleans.`true`
import typings.ackeeTracker.mod.DefaultData
import typings.ackeeTracker.mod.DetailedData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): DefaultData = js.native
    def apply(detailed: Boolean): DefaultData | (DefaultData & DetailedData) = js.native
    def apply(detailed: `false`): DefaultData = js.native
    def apply(detailed: `true`): DefaultData & DetailedData = js.native
  }
}

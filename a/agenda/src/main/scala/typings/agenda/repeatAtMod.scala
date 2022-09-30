package typings.agenda

import typings.agenda.jobMod.Job
import typings.agenda.jobMod.JobAttributesData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repeatAtMod {
  
  @JSImport("agenda/dist/job/repeat-at", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def repeatAt(time: String): Job[JobAttributesData] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeatAt")(time.asInstanceOf[js.Any]).asInstanceOf[Job[JobAttributesData]]
}

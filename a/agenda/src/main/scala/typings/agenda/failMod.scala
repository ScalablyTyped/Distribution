package typings.agenda

import typings.agenda.jobMod.Job
import typings.agenda.jobMod.JobAttributesData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object failMod {
  
  @JSImport("agenda/dist/job/fail", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fail(reason: String): Job[JobAttributesData] = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")(reason.asInstanceOf[js.Any]).asInstanceOf[Job[JobAttributesData]]
  inline def fail(reason: js.Error): Job[JobAttributesData] = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")(reason.asInstanceOf[js.Any]).asInstanceOf[Job[JobAttributesData]]
}

package typings.agenda

import typings.agenda.jobMod.Job
import typings.agenda.jobMod.JobAttributesData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setShouldsaveresultMod {
  
  @JSImport("agenda/dist/job/set-shouldsaveresult", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setShouldSaveResult(shouldSaveResult: Boolean): Job[JobAttributesData] = ^.asInstanceOf[js.Dynamic].applyDynamic("setShouldSaveResult")(shouldSaveResult.asInstanceOf[js.Any]).asInstanceOf[Job[JobAttributesData]]
}

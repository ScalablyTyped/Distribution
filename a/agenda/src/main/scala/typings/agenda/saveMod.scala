package typings.agenda

import typings.agenda.jobMod.Job
import typings.agenda.jobMod.JobAttributesData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object saveMod {
  
  @JSImport("agenda/dist/job/save", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def save(): js.Promise[Job[JobAttributesData]] = ^.asInstanceOf[js.Dynamic].applyDynamic("save")().asInstanceOf[js.Promise[Job[JobAttributesData]]]
}

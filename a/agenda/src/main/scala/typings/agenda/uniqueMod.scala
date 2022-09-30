package typings.agenda

import typings.agenda.anon.InsertOnly
import typings.agenda.jobMod.Job
import typings.agenda.jobMod.JobAttributesData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uniqueMod {
  
  @JSImport("agenda/dist/job/unique", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unique(unique: Any): Job[JobAttributesData] = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")(unique.asInstanceOf[js.Any]).asInstanceOf[Job[JobAttributesData]]
  inline def unique(unique: Any, options: InsertOnly): Job[JobAttributesData] = (^.asInstanceOf[js.Dynamic].applyDynamic("unique")(unique.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Job[JobAttributesData]]
}

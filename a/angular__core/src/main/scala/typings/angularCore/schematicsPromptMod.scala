package typings.angularCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schematicsPromptMod {
  
  @JSImport("@angular/core/schematics/utils/schematics_prompt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInquirer(): Inquirer = ^.asInstanceOf[js.Dynamic].applyDynamic("getInquirer")().asInstanceOf[Inquirer]
  
  inline def supportsPrompt(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsPrompt")().asInstanceOf[Boolean]
  
  @js.native
  trait Inquirer
    extends StObject
       with typings.inquirer.mod.Inquirer {
    
    /**
      * Provides components for the prompts.
      */
    val prompts: js.Any = js.native
  }
}

package typings.angularCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schematicsPromptMod {
  
  @JSImport("@angular/core/schematics/utils/schematics_prompt", "getInquirer")
  @js.native
  def getInquirer(): Inquirer = js.native
  
  @JSImport("@angular/core/schematics/utils/schematics_prompt", "supportsPrompt")
  @js.native
  def supportsPrompt(): Boolean = js.native
  
  @js.native
  trait Inquirer
    extends typings.inquirer.mod.Inquirer {
    
    /**
      * Provides components for the prompts.
      */
    val prompts: js.Any = js.native
  }
}

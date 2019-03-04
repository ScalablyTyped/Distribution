package typings
package atAntDashDesignIconsLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconDefinition extends js.Object {
  var icon: (js.Function2[
    /* primaryColor */ java.lang.String, 
    /* secondaryColor */ java.lang.String, 
    AbstractNode
  ]) | AbstractNode
  var name: java.lang.String
  var theme: ThemeType
}

object IconDefinition {
  @scala.inline
  def apply(
    icon: (js.Function2[
      /* primaryColor */ java.lang.String, 
      /* secondaryColor */ java.lang.String, 
      AbstractNode
    ]) | AbstractNode,
    name: java.lang.String,
    theme: ThemeType
  ): IconDefinition = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], name = name, theme = theme)
  
    __obj.asInstanceOf[IconDefinition]
  }
}


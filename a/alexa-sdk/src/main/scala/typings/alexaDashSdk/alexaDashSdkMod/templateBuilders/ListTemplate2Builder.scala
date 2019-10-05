package typings.alexaDashSdk.alexaDashSdkMod.templateBuilders

import typings.alexaDashSdk.alexaDashSdkMod.ListItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to create ListTemplate2 objects
  */
@JSImport("alexa-sdk", "templateBuilders.ListTemplate2Builder")
@js.native
class ListTemplate2Builder ()
  extends TemplateBuilder[ListTemplate2Builder]
     with SetListItems[ListTemplate2Builder] {
  /* CompleteClass */
  override def setListItems(listItems: js.Array[ListItem]): ListTemplate2Builder = js.native
}


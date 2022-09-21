package typings.airtable

import org.scalablytyped.runtime.StringDictionary
import typings.airtable.attachmentMod.Attachment
import typings.airtable.collaboratorMod.Collaborator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldSetMod {
  
  type FieldSet = StringDictionary[
    js.UndefOr[
      String | Double | Boolean | Collaborator | (js.Array[Attachment | Collaborator | String])
    ]
  ]
}

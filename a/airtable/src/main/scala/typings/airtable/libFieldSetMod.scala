package typings.airtable

import org.scalablytyped.runtime.StringDictionary
import typings.airtable.libAttachmentMod.Attachment
import typings.airtable.libCollaboratorMod.Collaborator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFieldSetMod {
  
  type FieldSet = StringDictionary[
    js.UndefOr[
      String | Double | Boolean | Collaborator | (js.Array[Attachment | Collaborator | String])
    ]
  ]
}

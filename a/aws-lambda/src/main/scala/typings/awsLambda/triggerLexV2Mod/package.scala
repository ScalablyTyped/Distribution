package typings.awsLambda.triggerLexV2Mod

import typings.awsLambda.anon.SlotElicitationStyle
import typings.awsLambda.anon.SlotToElicit
import typings.awsLambda.anon.SlotToElicitType
import typings.awsLambda.handlerMod.Callback
import typings.awsLambda.handlerMod.Handler
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type LexV2Callback = Callback[LexV2Result]

type LexV2DialogAction = (LevV2DialogActionWithoutSlot & SlotToElicit) | SlotToElicitType

type LexV2Handler = Handler[LexV2Event, LexV2Result]

type LexV2ResultDialogAction = (LevV2DialogActionWithoutSlot & SlotToElicit) | SlotElicitationStyle

type LexV2Slots = Record[String, LexV2Slot | Null]

package typings.awsLambda.triggerS3EventNotificationMod

import typings.awsLambda.anon.Source
import typings.awsLambda.handlerMod.Handler
import typings.awsLambda.triggerEventbridgeMod.EventBridgeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type S3NotificationEventBridgeHandler[EventType /* <: S3NotificationEvent */] = Handler[
(EventBridgeEvent[
  /* import warning: importer.ImportType#apply Failed type conversion: EventType['detail-type'] */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: EventType['detail'] */ js.Any
]) & Source, 
Unit]

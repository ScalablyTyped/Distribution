package typings
package awsDashSdkLib.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LexModelBuildingService
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_LexModelBuildingService: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.ClientConfiguration = js.native
  /**
    * Creates a new version of the bot based on the $LATEST version. If the $LATEST version of this resource hasn't changed since you created the last version, Amazon Lex doesn't create a new version. It returns the last created version.  You can update only the $LATEST version of the bot. You can't update the numbered versions that you create with the CreateBotVersion operation.   When you create the first version of a bot, Amazon Lex sets the version to 1. Subsequent versions increment by 1. For more information, see versioning-intro.   This operation requires permission for the lex:CreateBotVersion action. 
    */
  def createBotVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.CreateBotVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createBotVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.CreateBotVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.CreateBotVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new version of the bot based on the $LATEST version. If the $LATEST version of this resource hasn't changed since you created the last version, Amazon Lex doesn't create a new version. It returns the last created version.  You can update only the $LATEST version of the bot. You can't update the numbered versions that you create with the CreateBotVersion operation.   When you create the first version of a bot, Amazon Lex sets the version to 1. Subsequent versions increment by 1. For more information, see versioning-intro.   This operation requires permission for the lex:CreateBotVersion action. 
    */
  def createBotVersion(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.CreateBotVersionRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.CreateBotVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createBotVersion(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.CreateBotVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.CreateBotVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.CreateBotVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new version of an intent based on the $LATEST version of the intent. If the $LATEST version of this intent hasn't changed since you last updated it, Amazon Lex doesn't create a new version. It returns the last version you created.  You can update only the $LATEST version of the intent. You can't update the numbered versions that you create with the CreateIntentVersion operation.   When you create a version of an intent, Amazon Lex sets the version to 1. Subsequent versions increment by 1. For more information, see versioning-intro.  This operation requires permissions to perform the lex:CreateIntentVersion action. 
    */
  def createIntentVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.CreateIntentVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createIntentVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.CreateIntentVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.CreateIntentVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new version of an intent based on the $LATEST version of the intent. If the $LATEST version of this intent hasn't changed since you last updated it, Amazon Lex doesn't create a new version. It returns the last version you created.  You can update only the $LATEST version of the intent. You can't update the numbered versions that you create with the CreateIntentVersion operation.   When you create a version of an intent, Amazon Lex sets the version to 1. Subsequent versions increment by 1. For more information, see versioning-intro.  This operation requires permissions to perform the lex:CreateIntentVersion action. 
    */
  def createIntentVersion(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.CreateIntentVersionRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.CreateIntentVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createIntentVersion(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.CreateIntentVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.CreateIntentVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.CreateIntentVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new version of a slot type based on the $LATEST version of the specified slot type. If the $LATEST version of this resource has not changed since the last version that you created, Amazon Lex doesn't create a new version. It returns the last version that you created.   You can update only the $LATEST version of a slot type. You can't update the numbered versions that you create with the CreateSlotTypeVersion operation.  When you create a version of a slot type, Amazon Lex sets the version to 1. Subsequent versions increment by 1. For more information, see versioning-intro.  This operation requires permissions for the lex:CreateSlotTypeVersion action.
    */
  def createSlotTypeVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.CreateSlotTypeVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createSlotTypeVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.CreateSlotTypeVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.CreateSlotTypeVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new version of a slot type based on the $LATEST version of the specified slot type. If the $LATEST version of this resource has not changed since the last version that you created, Amazon Lex doesn't create a new version. It returns the last version that you created.   You can update only the $LATEST version of a slot type. You can't update the numbered versions that you create with the CreateSlotTypeVersion operation.  When you create a version of a slot type, Amazon Lex sets the version to 1. Subsequent versions increment by 1. For more information, see versioning-intro.  This operation requires permissions for the lex:CreateSlotTypeVersion action.
    */
  def createSlotTypeVersion(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.CreateSlotTypeVersionRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.CreateSlotTypeVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createSlotTypeVersion(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.CreateSlotTypeVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.CreateSlotTypeVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.CreateSlotTypeVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes all versions of the bot, including the $LATEST version. To delete a specific version of the bot, use the DeleteBotVersion operation. If a bot has an alias, you can't delete it. Instead, the DeleteBot operation returns a ResourceInUseException exception that includes a reference to the alias that refers to the bot. To remove the reference to the bot, delete the alias. If you get the same exception again, delete the referring alias until the DeleteBot operation is successful. This operation requires permissions for the lex:DeleteBot action.
    */
  def deleteBot(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBot(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes all versions of the bot, including the $LATEST version. To delete a specific version of the bot, use the DeleteBotVersion operation. If a bot has an alias, you can't delete it. Instead, the DeleteBot operation returns a ResourceInUseException exception that includes a reference to the alias that refers to the bot. To remove the reference to the bot, delete the alias. If you get the same exception again, delete the referring alias until the DeleteBot operation is successful. This operation requires permissions for the lex:DeleteBot action.
    */
  def deleteBot(params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.DeleteBotRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBot(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.DeleteBotRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an alias for the specified bot.  You can't delete an alias that is used in the association between a bot and a messaging channel. If an alias is used in a channel association, the DeleteBot operation returns a ResourceInUseException exception that includes a reference to the channel association that refers to the bot. You can remove the reference to the alias by deleting the channel association. If you get the same exception again, delete the referring association until the DeleteBotAlias operation is successful.
    */
  def deleteBotAlias(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBotAlias(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an alias for the specified bot.  You can't delete an alias that is used in the association between a bot and a messaging channel. If an alias is used in a channel association, the DeleteBot operation returns a ResourceInUseException exception that includes a reference to the channel association that refers to the bot. You can remove the reference to the alias by deleting the channel association. If you get the same exception again, delete the referring association until the DeleteBotAlias operation is successful.
    */
  def deleteBotAlias(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.DeleteBotAliasRequest
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBotAlias(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.DeleteBotAliasRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the association between an Amazon Lex bot and a messaging platform. This operation requires permission for the lex:DeleteBotChannelAssociation action.
    */
  def deleteBotChannelAssociation(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBotChannelAssociation(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the association between an Amazon Lex bot and a messaging platform. This operation requires permission for the lex:DeleteBotChannelAssociation action.
    */
  def deleteBotChannelAssociation(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.DeleteBotChannelAssociationRequest
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBotChannelAssociation(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.DeleteBotChannelAssociationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specific version of a bot. To delete all versions of a bot, use the DeleteBot operation.  This operation requires permissions for the lex:DeleteBotVersion action.
    */
  def deleteBotVersion(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBotVersion(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specific version of a bot. To delete all versions of a bot, use the DeleteBot operation.  This operation requires permissions for the lex:DeleteBotVersion action.
    */
  def deleteBotVersion(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.DeleteBotVersionRequest
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBotVersion(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.DeleteBotVersionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes all versions of the intent, including the $LATEST version. To delete a specific version of the intent, use the DeleteIntentVersion operation.  You can delete a version of an intent only if it is not referenced. To delete an intent that is referred to in one or more bots (see how-it-works), you must remove those references first.    If you get the ResourceInUseException exception, it provides an example reference that shows where the intent is referenced. To remove the reference to the intent, either update the bot or delete it. If you get the same exception when you attempt to delete the intent again, repeat until the intent has no references and the call to DeleteIntent is successful.    This operation requires permission for the lex:DeleteIntent action. 
    */
  def deleteIntent(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteIntent(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes all versions of the intent, including the $LATEST version. To delete a specific version of the intent, use the DeleteIntentVersion operation.  You can delete a version of an intent only if it is not referenced. To delete an intent that is referred to in one or more bots (see how-it-works), you must remove those references first.    If you get the ResourceInUseException exception, it provides an example reference that shows where the intent is referenced. To remove the reference to the intent, either update the bot or delete it. If you get the same exception when you attempt to delete the intent again, repeat until the intent has no references and the call to DeleteIntent is successful.    This operation requires permission for the lex:DeleteIntent action. 
    */
  def deleteIntent(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.DeleteIntentRequest
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteIntent(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.DeleteIntentRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specific version of an intent. To delete all versions of a intent, use the DeleteIntent operation.  This operation requires permissions for the lex:DeleteIntentVersion action.
    */
  def deleteIntentVersion(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteIntentVersion(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specific version of an intent. To delete all versions of a intent, use the DeleteIntent operation.  This operation requires permissions for the lex:DeleteIntentVersion action.
    */
  def deleteIntentVersion(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.DeleteIntentVersionRequest
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteIntentVersion(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.DeleteIntentVersionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes all versions of the slot type, including the $LATEST version. To delete a specific version of the slot type, use the DeleteSlotTypeVersion operation.  You can delete a version of a slot type only if it is not referenced. To delete a slot type that is referred to in one or more intents, you must remove those references first.    If you get the ResourceInUseException exception, the exception provides an example reference that shows the intent where the slot type is referenced. To remove the reference to the slot type, either update the intent or delete it. If you get the same exception when you attempt to delete the slot type again, repeat until the slot type has no references and the DeleteSlotType call is successful.   This operation requires permission for the lex:DeleteSlotType action.
    */
  def deleteSlotType(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSlotType(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes all versions of the slot type, including the $LATEST version. To delete a specific version of the slot type, use the DeleteSlotTypeVersion operation.  You can delete a version of a slot type only if it is not referenced. To delete a slot type that is referred to in one or more intents, you must remove those references first.    If you get the ResourceInUseException exception, the exception provides an example reference that shows the intent where the slot type is referenced. To remove the reference to the slot type, either update the intent or delete it. If you get the same exception when you attempt to delete the slot type again, repeat until the slot type has no references and the DeleteSlotType call is successful.   This operation requires permission for the lex:DeleteSlotType action.
    */
  def deleteSlotType(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.DeleteSlotTypeRequest
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSlotType(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.DeleteSlotTypeRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specific version of a slot type. To delete all versions of a slot type, use the DeleteSlotType operation.  This operation requires permissions for the lex:DeleteSlotTypeVersion action.
    */
  def deleteSlotTypeVersion(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSlotTypeVersion(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specific version of a slot type. To delete all versions of a slot type, use the DeleteSlotType operation.  This operation requires permissions for the lex:DeleteSlotTypeVersion action.
    */
  def deleteSlotTypeVersion(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.DeleteSlotTypeVersionRequest
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSlotTypeVersion(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.DeleteSlotTypeVersionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes stored utterances. Amazon Lex stores the utterances that users send to your bot. Utterances are stored for 15 days for use with the GetUtterancesView operation, and then stored indefinitely for use in improving the ability of your bot to respond to user input. Use the DeleteStoredUtterances operation to manually delete stored utterances for a specific user. This operation requires permissions for the lex:DeleteUtterances action.
    */
  def deleteUtterances(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUtterances(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes stored utterances. Amazon Lex stores the utterances that users send to your bot. Utterances are stored for 15 days for use with the GetUtterancesView operation, and then stored indefinitely for use in improving the ability of your bot to respond to user input. Use the DeleteStoredUtterances operation to manually delete stored utterances for a specific user. This operation requires permissions for the lex:DeleteUtterances action.
    */
  def deleteUtterances(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.DeleteUtterancesRequest
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUtterances(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.DeleteUtterancesRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns metadata information for a specific bot. You must provide the bot name and the bot version or alias.   This operation requires permissions for the lex:GetBot action. 
    */
  def getBot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns metadata information for a specific bot. You must provide the bot name and the bot version or alias.   This operation requires permissions for the lex:GetBot action. 
    */
  def getBot(params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBot(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about an Amazon Lex bot alias. For more information about aliases, see versioning-aliases. This operation requires permissions for the lex:GetBotAlias action.
    */
  def getBotAlias(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotAliasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBotAlias(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotAliasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotAliasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about an Amazon Lex bot alias. For more information about aliases, see versioning-aliases. This operation requires permissions for the lex:GetBotAlias action.
    */
  def getBotAlias(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotAliasRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotAliasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBotAlias(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotAliasRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotAliasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotAliasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of aliases for a specified Amazon Lex bot. This operation requires permissions for the lex:GetBotAliases action.
    */
  def getBotAliases(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotAliasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBotAliases(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotAliasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotAliasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of aliases for a specified Amazon Lex bot. This operation requires permissions for the lex:GetBotAliases action.
    */
  def getBotAliases(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotAliasesRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotAliasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBotAliases(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotAliasesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotAliasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotAliasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about the association between an Amazon Lex bot and a messaging platform. This operation requires permissions for the lex:GetBotChannelAssociation action.
    */
  def getBotChannelAssociation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotChannelAssociationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBotChannelAssociation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotChannelAssociationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotChannelAssociationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about the association between an Amazon Lex bot and a messaging platform. This operation requires permissions for the lex:GetBotChannelAssociation action.
    */
  def getBotChannelAssociation(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotChannelAssociationRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotChannelAssociationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBotChannelAssociation(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotChannelAssociationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotChannelAssociationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotChannelAssociationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Returns a list of all of the channels associated with the specified bot.  The GetBotChannelAssociations operation requires permissions for the lex:GetBotChannelAssociations action.
    */
  def getBotChannelAssociations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotChannelAssociationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBotChannelAssociations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotChannelAssociationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotChannelAssociationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Returns a list of all of the channels associated with the specified bot.  The GetBotChannelAssociations operation requires permissions for the lex:GetBotChannelAssociations action.
    */
  def getBotChannelAssociations(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotChannelAssociationsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotChannelAssociationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBotChannelAssociations(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotChannelAssociationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotChannelAssociationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotChannelAssociationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about all of the versions of a bot. The GetBotVersions operation returns a BotMetadata object for each version of a bot. For example, if a bot has three numbered versions, the GetBotVersions operation returns four BotMetadata objects in the response, one for each numbered version and one for the $LATEST version.  The GetBotVersions operation always returns at least one version, the $LATEST version. This operation requires permissions for the lex:GetBotVersions action.
    */
  def getBotVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBotVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about all of the versions of a bot. The GetBotVersions operation returns a BotMetadata object for each version of a bot. For example, if a bot has three numbered versions, the GetBotVersions operation returns four BotMetadata objects in the response, one for each numbered version and one for the $LATEST version.  The GetBotVersions operation always returns at least one version, the $LATEST version. This operation requires permissions for the lex:GetBotVersions action.
    */
  def getBotVersions(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotVersionsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBotVersions(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns bot information as follows:    If you provide the nameContains field, the response includes information for the $LATEST version of all bots whose name contains the specified string.   If you don't specify the nameContains field, the operation returns information about the $LATEST version of all of your bots.   This operation requires permission for the lex:GetBots action.
    */
  def getBots(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBots(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns bot information as follows:    If you provide the nameContains field, the response includes information for the $LATEST version of all bots whose name contains the specified string.   If you don't specify the nameContains field, the operation returns information about the $LATEST version of all of your bots.   This operation requires permission for the lex:GetBots action.
    */
  def getBots(params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBots(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBotsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a built-in intent. This operation requires permission for the lex:GetBuiltinIntent action.
    */
  def getBuiltinIntent(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBuiltinIntentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBuiltinIntent(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBuiltinIntentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBuiltinIntentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a built-in intent. This operation requires permission for the lex:GetBuiltinIntent action.
    */
  def getBuiltinIntent(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBuiltinIntentRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBuiltinIntentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBuiltinIntent(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBuiltinIntentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBuiltinIntentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBuiltinIntentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a list of built-in intents that meet the specified criteria. This operation requires permission for the lex:GetBuiltinIntents action.
    */
  def getBuiltinIntents(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBuiltinIntentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBuiltinIntents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBuiltinIntentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBuiltinIntentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a list of built-in intents that meet the specified criteria. This operation requires permission for the lex:GetBuiltinIntents action.
    */
  def getBuiltinIntents(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBuiltinIntentsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBuiltinIntentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBuiltinIntents(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBuiltinIntentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBuiltinIntentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBuiltinIntentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a list of built-in slot types that meet the specified criteria. For a list of built-in slot types, see Slot Type Reference in the Alexa Skills Kit. This operation requires permission for the lex:GetBuiltInSlotTypes action.
    */
  def getBuiltinSlotTypes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBuiltinSlotTypesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBuiltinSlotTypes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBuiltinSlotTypesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBuiltinSlotTypesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a list of built-in slot types that meet the specified criteria. For a list of built-in slot types, see Slot Type Reference in the Alexa Skills Kit. This operation requires permission for the lex:GetBuiltInSlotTypes action.
    */
  def getBuiltinSlotTypes(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBuiltinSlotTypesRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBuiltinSlotTypesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getBuiltinSlotTypes(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBuiltinSlotTypesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBuiltinSlotTypesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetBuiltinSlotTypesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Exports the contents of a Amazon Lex resource in a specified format. 
    */
  def getExport(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetExportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getExport(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetExportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetExportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Exports the contents of a Amazon Lex resource in a specified format. 
    */
  def getExport(params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetExportRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetExportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getExport(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetExportRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetExportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetExportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about an import job started with the StartImport operation.
    */
  def getImport(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetImportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getImport(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetImportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetImportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about an import job started with the StartImport operation.
    */
  def getImport(params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetImportRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetImportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getImport(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetImportRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetImportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetImportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Returns information about an intent. In addition to the intent name, you must specify the intent version.   This operation requires permissions to perform the lex:GetIntent action. 
    */
  def getIntent(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetIntentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getIntent(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetIntentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetIntentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  Returns information about an intent. In addition to the intent name, you must specify the intent version.   This operation requires permissions to perform the lex:GetIntent action. 
    */
  def getIntent(params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetIntentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetIntentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getIntent(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetIntentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetIntentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetIntentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about all of the versions of an intent. The GetIntentVersions operation returns an IntentMetadata object for each version of an intent. For example, if an intent has three numbered versions, the GetIntentVersions operation returns four IntentMetadata objects in the response, one for each numbered version and one for the $LATEST version.  The GetIntentVersions operation always returns at least one version, the $LATEST version. This operation requires permissions for the lex:GetIntentVersions action.
    */
  def getIntentVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetIntentVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getIntentVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetIntentVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetIntentVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about all of the versions of an intent. The GetIntentVersions operation returns an IntentMetadata object for each version of an intent. For example, if an intent has three numbered versions, the GetIntentVersions operation returns four IntentMetadata objects in the response, one for each numbered version and one for the $LATEST version.  The GetIntentVersions operation always returns at least one version, the $LATEST version. This operation requires permissions for the lex:GetIntentVersions action.
    */
  def getIntentVersions(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetIntentVersionsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetIntentVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getIntentVersions(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetIntentVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetIntentVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetIntentVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns intent information as follows:    If you specify the nameContains field, returns the $LATEST version of all intents that contain the specified string.    If you don't specify the nameContains field, returns information about the $LATEST version of all intents.     The operation requires permission for the lex:GetIntents action. 
    */
  def getIntents(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetIntentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getIntents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetIntentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetIntentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns intent information as follows:    If you specify the nameContains field, returns the $LATEST version of all intents that contain the specified string.    If you don't specify the nameContains field, returns information about the $LATEST version of all intents.     The operation requires permission for the lex:GetIntents action. 
    */
  def getIntents(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetIntentsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetIntentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getIntents(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetIntentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetIntentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetIntentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a specific version of a slot type. In addition to specifying the slot type name, you must specify the slot type version. This operation requires permissions for the lex:GetSlotType action.
    */
  def getSlotType(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetSlotTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getSlotType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetSlotTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetSlotTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a specific version of a slot type. In addition to specifying the slot type name, you must specify the slot type version. This operation requires permissions for the lex:GetSlotType action.
    */
  def getSlotType(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetSlotTypeRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetSlotTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getSlotType(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetSlotTypeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetSlotTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetSlotTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about all versions of a slot type. The GetSlotTypeVersions operation returns a SlotTypeMetadata object for each version of a slot type. For example, if a slot type has three numbered versions, the GetSlotTypeVersions operation returns four SlotTypeMetadata objects in the response, one for each numbered version and one for the $LATEST version.  The GetSlotTypeVersions operation always returns at least one version, the $LATEST version. This operation requires permissions for the lex:GetSlotTypeVersions action.
    */
  def getSlotTypeVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetSlotTypeVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getSlotTypeVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetSlotTypeVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetSlotTypeVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about all versions of a slot type. The GetSlotTypeVersions operation returns a SlotTypeMetadata object for each version of a slot type. For example, if a slot type has three numbered versions, the GetSlotTypeVersions operation returns four SlotTypeMetadata objects in the response, one for each numbered version and one for the $LATEST version.  The GetSlotTypeVersions operation always returns at least one version, the $LATEST version. This operation requires permissions for the lex:GetSlotTypeVersions action.
    */
  def getSlotTypeVersions(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetSlotTypeVersionsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetSlotTypeVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getSlotTypeVersions(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetSlotTypeVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetSlotTypeVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetSlotTypeVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns slot type information as follows:    If you specify the nameContains field, returns the $LATEST version of all slot types that contain the specified string.    If you don't specify the nameContains field, returns information about the $LATEST version of all slot types.     The operation requires permission for the lex:GetSlotTypes action. 
    */
  def getSlotTypes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetSlotTypesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getSlotTypes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetSlotTypesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetSlotTypesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns slot type information as follows:    If you specify the nameContains field, returns the $LATEST version of all slot types that contain the specified string.    If you don't specify the nameContains field, returns information about the $LATEST version of all slot types.     The operation requires permission for the lex:GetSlotTypes action. 
    */
  def getSlotTypes(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetSlotTypesRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetSlotTypesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getSlotTypes(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetSlotTypesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetSlotTypesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetSlotTypesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Use the GetUtterancesView operation to get information about the utterances that your users have made to your bot. You can use this list to tune the utterances that your bot responds to. For example, say that you have created a bot to order flowers. After your users have used your bot for a while, use the GetUtterancesView operation to see the requests that they have made and whether they have been successful. You might find that the utterance "I want flowers" is not being recognized. You could add this utterance to the OrderFlowers intent so that your bot recognizes that utterance. After you publish a new version of a bot, you can get information about the old version and the new so that you can compare the performance across the two versions.   Utterance statistics are generated once a day. Data is available for the last 15 days. You can request information for up to 5 versions in each request. The response contains information about a maximum of 100 utterances for each version.  This operation requires permissions for the lex:GetUtterancesView action.
    */
  def getUtterancesView(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetUtterancesViewResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getUtterancesView(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetUtterancesViewResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetUtterancesViewResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Use the GetUtterancesView operation to get information about the utterances that your users have made to your bot. You can use this list to tune the utterances that your bot responds to. For example, say that you have created a bot to order flowers. After your users have used your bot for a while, use the GetUtterancesView operation to see the requests that they have made and whether they have been successful. You might find that the utterance "I want flowers" is not being recognized. You could add this utterance to the OrderFlowers intent so that your bot recognizes that utterance. After you publish a new version of a bot, you can get information about the old version and the new so that you can compare the performance across the two versions.   Utterance statistics are generated once a day. Data is available for the last 15 days. You can request information for up to 5 versions in each request. The response contains information about a maximum of 100 utterances for each version.  This operation requires permissions for the lex:GetUtterancesView action.
    */
  def getUtterancesView(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetUtterancesViewRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetUtterancesViewResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getUtterancesView(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetUtterancesViewRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetUtterancesViewResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.GetUtterancesViewResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an Amazon Lex conversational bot or replaces an existing bot. When you create or update a bot you are only required to specify a name, a locale, and whether the bot is directed toward children under age 13. You can use this to add intents later, or to remove intents from an existing bot. When you create a bot with the minimum information, the bot is created or updated but Amazon Lex returns the  response FAILED. You can build the bot after you add one or more intents. For more information about Amazon Lex bots, see how-it-works.  If you specify the name of an existing bot, the fields in the request replace the existing values in the $LATEST version of the bot. Amazon Lex removes any fields that you don't provide values for in the request, except for the idleTTLInSeconds and privacySettings fields, which are set to their default values. If you don't specify values for required fields, Amazon Lex throws an exception. This operation requires permissions for the lex:PutBot action. For more information, see auth-and-access-control.
    */
  def putBot(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.PutBotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putBot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.PutBotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.PutBotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an Amazon Lex conversational bot or replaces an existing bot. When you create or update a bot you are only required to specify a name, a locale, and whether the bot is directed toward children under age 13. You can use this to add intents later, or to remove intents from an existing bot. When you create a bot with the minimum information, the bot is created or updated but Amazon Lex returns the  response FAILED. You can build the bot after you add one or more intents. For more information about Amazon Lex bots, see how-it-works.  If you specify the name of an existing bot, the fields in the request replace the existing values in the $LATEST version of the bot. Amazon Lex removes any fields that you don't provide values for in the request, except for the idleTTLInSeconds and privacySettings fields, which are set to their default values. If you don't specify values for required fields, Amazon Lex throws an exception. This operation requires permissions for the lex:PutBot action. For more information, see auth-and-access-control.
    */
  def putBot(params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.PutBotRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.PutBotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putBot(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.PutBotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.PutBotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.PutBotResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an alias for the specified version of the bot or replaces an alias for the specified bot. To change the version of the bot that the alias points to, replace the alias. For more information about aliases, see versioning-aliases. This operation requires permissions for the lex:PutBotAlias action. 
    */
  def putBotAlias(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.PutBotAliasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putBotAlias(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.PutBotAliasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.PutBotAliasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an alias for the specified version of the bot or replaces an alias for the specified bot. To change the version of the bot that the alias points to, replace the alias. For more information about aliases, see versioning-aliases. This operation requires permissions for the lex:PutBotAlias action. 
    */
  def putBotAlias(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.PutBotAliasRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.PutBotAliasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putBotAlias(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.PutBotAliasRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.PutBotAliasResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.PutBotAliasResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an intent or replaces an existing intent. To define the interaction between the user and your bot, you use one or more intents. For a pizza ordering bot, for example, you would create an OrderPizza intent.  To create an intent or replace an existing intent, you must provide the following:   Intent name. For example, OrderPizza.   Sample utterances. For example, "Can I order a pizza, please." and "I want to order a pizza."   Information to be gathered. You specify slot types for the information that your bot will request from the user. You can specify standard slot types, such as a date or a time, or custom slot types such as the size and crust of a pizza.   How the intent will be fulfilled. You can provide a Lambda function or configure the intent to return the intent information to the client application. If you use a Lambda function, when all of the intent information is available, Amazon Lex invokes your Lambda function. If you configure your intent to return the intent information to the client application.    You can specify other optional information in the request, such as:   A confirmation prompt to ask the user to confirm an intent. For example, "Shall I order your pizza?"   A conclusion statement to send to the user after the intent has been fulfilled. For example, "I placed your pizza order."   A follow-up prompt that asks the user for additional activity. For example, asking "Do you want to order a drink with your pizza?"   If you specify an existing intent name to update the intent, Amazon Lex replaces the values in the $LATEST version of the intent with the values in the request. Amazon Lex removes fields that you don't provide in the request. If you don't specify the required fields, Amazon Lex throws an exception. When you update the $LATEST version of an intent, the status field of any bot that uses the $LATEST version of the intent is set to NOT_BUILT. For more information, see how-it-works. This operation requires permissions for the lex:PutIntent action.
    */
  def putIntent(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.PutIntentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putIntent(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.PutIntentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.PutIntentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an intent or replaces an existing intent. To define the interaction between the user and your bot, you use one or more intents. For a pizza ordering bot, for example, you would create an OrderPizza intent.  To create an intent or replace an existing intent, you must provide the following:   Intent name. For example, OrderPizza.   Sample utterances. For example, "Can I order a pizza, please." and "I want to order a pizza."   Information to be gathered. You specify slot types for the information that your bot will request from the user. You can specify standard slot types, such as a date or a time, or custom slot types such as the size and crust of a pizza.   How the intent will be fulfilled. You can provide a Lambda function or configure the intent to return the intent information to the client application. If you use a Lambda function, when all of the intent information is available, Amazon Lex invokes your Lambda function. If you configure your intent to return the intent information to the client application.    You can specify other optional information in the request, such as:   A confirmation prompt to ask the user to confirm an intent. For example, "Shall I order your pizza?"   A conclusion statement to send to the user after the intent has been fulfilled. For example, "I placed your pizza order."   A follow-up prompt that asks the user for additional activity. For example, asking "Do you want to order a drink with your pizza?"   If you specify an existing intent name to update the intent, Amazon Lex replaces the values in the $LATEST version of the intent with the values in the request. Amazon Lex removes fields that you don't provide in the request. If you don't specify the required fields, Amazon Lex throws an exception. When you update the $LATEST version of an intent, the status field of any bot that uses the $LATEST version of the intent is set to NOT_BUILT. For more information, see how-it-works. This operation requires permissions for the lex:PutIntent action.
    */
  def putIntent(params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.PutIntentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.PutIntentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putIntent(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.PutIntentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.PutIntentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.PutIntentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a custom slot type or replaces an existing custom slot type. To create a custom slot type, specify a name for the slot type and a set of enumeration values, which are the values that a slot of this type can assume. For more information, see how-it-works. If you specify the name of an existing slot type, the fields in the request replace the existing values in the $LATEST version of the slot type. Amazon Lex removes the fields that you don't provide in the request. If you don't specify required fields, Amazon Lex throws an exception. When you update the $LATEST version of a slot type, if a bot uses the $LATEST version of an intent that contains the slot type, the bot's status field is set to NOT_BUILT. This operation requires permissions for the lex:PutSlotType action.
    */
  def putSlotType(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.PutSlotTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putSlotType(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.PutSlotTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.PutSlotTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a custom slot type or replaces an existing custom slot type. To create a custom slot type, specify a name for the slot type and a set of enumeration values, which are the values that a slot of this type can assume. For more information, see how-it-works. If you specify the name of an existing slot type, the fields in the request replace the existing values in the $LATEST version of the slot type. Amazon Lex removes the fields that you don't provide in the request. If you don't specify required fields, Amazon Lex throws an exception. When you update the $LATEST version of a slot type, if a bot uses the $LATEST version of an intent that contains the slot type, the bot's status field is set to NOT_BUILT. This operation requires permissions for the lex:PutSlotType action.
    */
  def putSlotType(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.PutSlotTypeRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.PutSlotTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putSlotType(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.PutSlotTypeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.PutSlotTypeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.PutSlotTypeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts a job to import a resource to Amazon Lex.
    */
  def startImport(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.StartImportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startImport(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.StartImportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.StartImportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts a job to import a resource to Amazon Lex.
    */
  def startImport(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.StartImportRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.StartImportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startImport(
    params: awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.StartImportRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.StartImportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsLexmodelbuildingserviceMod.LexModelBuildingServiceNs.StartImportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}


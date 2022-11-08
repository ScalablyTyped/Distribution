package typings.awsSdk.clientsLexmodelsv2Mod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LexModelsV2 extends Service {
  
  /**
    * Batch create custom vocabulary item for the specified locale in the specified bot.
    */
  def batchCreateCustomVocabularyItem(): Request[BatchCreateCustomVocabularyItemResponse, AWSError] = js.native
  def batchCreateCustomVocabularyItem(
    callback: js.Function2[/* err */ AWSError, /* data */ BatchCreateCustomVocabularyItemResponse, Unit]
  ): Request[BatchCreateCustomVocabularyItemResponse, AWSError] = js.native
  /**
    * Batch create custom vocabulary item for the specified locale in the specified bot.
    */
  def batchCreateCustomVocabularyItem(params: BatchCreateCustomVocabularyItemRequest): Request[BatchCreateCustomVocabularyItemResponse, AWSError] = js.native
  def batchCreateCustomVocabularyItem(
    params: BatchCreateCustomVocabularyItemRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchCreateCustomVocabularyItemResponse, Unit]
  ): Request[BatchCreateCustomVocabularyItemResponse, AWSError] = js.native
  
  /**
    * Batch delete custom vocabulary item for the specified locale in the specified bot.
    */
  def batchDeleteCustomVocabularyItem(): Request[BatchDeleteCustomVocabularyItemResponse, AWSError] = js.native
  def batchDeleteCustomVocabularyItem(
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteCustomVocabularyItemResponse, Unit]
  ): Request[BatchDeleteCustomVocabularyItemResponse, AWSError] = js.native
  /**
    * Batch delete custom vocabulary item for the specified locale in the specified bot.
    */
  def batchDeleteCustomVocabularyItem(params: BatchDeleteCustomVocabularyItemRequest): Request[BatchDeleteCustomVocabularyItemResponse, AWSError] = js.native
  def batchDeleteCustomVocabularyItem(
    params: BatchDeleteCustomVocabularyItemRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteCustomVocabularyItemResponse, Unit]
  ): Request[BatchDeleteCustomVocabularyItemResponse, AWSError] = js.native
  
  /**
    * Batch update custom vocabulary item for the specified locale in the specified bot.
    */
  def batchUpdateCustomVocabularyItem(): Request[BatchUpdateCustomVocabularyItemResponse, AWSError] = js.native
  def batchUpdateCustomVocabularyItem(
    callback: js.Function2[/* err */ AWSError, /* data */ BatchUpdateCustomVocabularyItemResponse, Unit]
  ): Request[BatchUpdateCustomVocabularyItemResponse, AWSError] = js.native
  /**
    * Batch update custom vocabulary item for the specified locale in the specified bot.
    */
  def batchUpdateCustomVocabularyItem(params: BatchUpdateCustomVocabularyItemRequest): Request[BatchUpdateCustomVocabularyItemResponse, AWSError] = js.native
  def batchUpdateCustomVocabularyItem(
    params: BatchUpdateCustomVocabularyItemRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchUpdateCustomVocabularyItemResponse, Unit]
  ): Request[BatchUpdateCustomVocabularyItemResponse, AWSError] = js.native
  
  /**
    * Builds a bot, its intents, and its slot types into a specific locale. A bot can be built into multiple locales. At runtime the locale is used to choose a specific build of the bot.
    */
  def buildBotLocale(): Request[BuildBotLocaleResponse, AWSError] = js.native
  def buildBotLocale(callback: js.Function2[/* err */ AWSError, /* data */ BuildBotLocaleResponse, Unit]): Request[BuildBotLocaleResponse, AWSError] = js.native
  /**
    * Builds a bot, its intents, and its slot types into a specific locale. A bot can be built into multiple locales. At runtime the locale is used to choose a specific build of the bot.
    */
  def buildBotLocale(params: BuildBotLocaleRequest): Request[BuildBotLocaleResponse, AWSError] = js.native
  def buildBotLocale(
    params: BuildBotLocaleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BuildBotLocaleResponse, Unit]
  ): Request[BuildBotLocaleResponse, AWSError] = js.native
  
  @JSName("config")
  var config_LexModelsV2: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an Amazon Lex conversational bot. 
    */
  def createBot(): Request[CreateBotResponse, AWSError] = js.native
  def createBot(callback: js.Function2[/* err */ AWSError, /* data */ CreateBotResponse, Unit]): Request[CreateBotResponse, AWSError] = js.native
  /**
    * Creates an Amazon Lex conversational bot. 
    */
  def createBot(params: CreateBotRequest): Request[CreateBotResponse, AWSError] = js.native
  def createBot(
    params: CreateBotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBotResponse, Unit]
  ): Request[CreateBotResponse, AWSError] = js.native
  
  /**
    * Creates an alias for the specified version of a bot. Use an alias to enable you to change the version of a bot without updating applications that use the bot. For example, you can create an alias called "PROD" that your applications use to call the Amazon Lex bot. 
    */
  def createBotAlias(): Request[CreateBotAliasResponse, AWSError] = js.native
  def createBotAlias(callback: js.Function2[/* err */ AWSError, /* data */ CreateBotAliasResponse, Unit]): Request[CreateBotAliasResponse, AWSError] = js.native
  /**
    * Creates an alias for the specified version of a bot. Use an alias to enable you to change the version of a bot without updating applications that use the bot. For example, you can create an alias called "PROD" that your applications use to call the Amazon Lex bot. 
    */
  def createBotAlias(params: CreateBotAliasRequest): Request[CreateBotAliasResponse, AWSError] = js.native
  def createBotAlias(
    params: CreateBotAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBotAliasResponse, Unit]
  ): Request[CreateBotAliasResponse, AWSError] = js.native
  
  /**
    * Creates a locale in the bot. The locale contains the intents and slot types that the bot uses in conversations with users in the specified language and locale. You must add a locale to a bot before you can add intents and slot types to the bot.
    */
  def createBotLocale(): Request[CreateBotLocaleResponse, AWSError] = js.native
  def createBotLocale(callback: js.Function2[/* err */ AWSError, /* data */ CreateBotLocaleResponse, Unit]): Request[CreateBotLocaleResponse, AWSError] = js.native
  /**
    * Creates a locale in the bot. The locale contains the intents and slot types that the bot uses in conversations with users in the specified language and locale. You must add a locale to a bot before you can add intents and slot types to the bot.
    */
  def createBotLocale(params: CreateBotLocaleRequest): Request[CreateBotLocaleResponse, AWSError] = js.native
  def createBotLocale(
    params: CreateBotLocaleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBotLocaleResponse, Unit]
  ): Request[CreateBotLocaleResponse, AWSError] = js.native
  
  /**
    * Creates a new version of the bot based on the DRAFT version. If the DRAFT version of this resource hasn't changed since you created the last version, Amazon Lex doesn't create a new version, it returns the last created version. When you create the first version of a bot, Amazon Lex sets the version to 1. Subsequent versions increment by 1.
    */
  def createBotVersion(): Request[CreateBotVersionResponse, AWSError] = js.native
  def createBotVersion(callback: js.Function2[/* err */ AWSError, /* data */ CreateBotVersionResponse, Unit]): Request[CreateBotVersionResponse, AWSError] = js.native
  /**
    * Creates a new version of the bot based on the DRAFT version. If the DRAFT version of this resource hasn't changed since you created the last version, Amazon Lex doesn't create a new version, it returns the last created version. When you create the first version of a bot, Amazon Lex sets the version to 1. Subsequent versions increment by 1.
    */
  def createBotVersion(params: CreateBotVersionRequest): Request[CreateBotVersionResponse, AWSError] = js.native
  def createBotVersion(
    params: CreateBotVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBotVersionResponse, Unit]
  ): Request[CreateBotVersionResponse, AWSError] = js.native
  
  /**
    * Creates a zip archive containing the contents of a bot or a bot locale. The archive contains a directory structure that contains JSON files that define the bot. You can create an archive that contains the complete definition of a bot, or you can specify that the archive contain only the definition of a single bot locale. For more information about exporting bots, and about the structure of the export archive, see  Importing and exporting bots  
    */
  def createExport(): Request[CreateExportResponse, AWSError] = js.native
  def createExport(callback: js.Function2[/* err */ AWSError, /* data */ CreateExportResponse, Unit]): Request[CreateExportResponse, AWSError] = js.native
  /**
    * Creates a zip archive containing the contents of a bot or a bot locale. The archive contains a directory structure that contains JSON files that define the bot. You can create an archive that contains the complete definition of a bot, or you can specify that the archive contain only the definition of a single bot locale. For more information about exporting bots, and about the structure of the export archive, see  Importing and exporting bots  
    */
  def createExport(params: CreateExportRequest): Request[CreateExportResponse, AWSError] = js.native
  def createExport(
    params: CreateExportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateExportResponse, Unit]
  ): Request[CreateExportResponse, AWSError] = js.native
  
  /**
    * Creates an intent. To define the interaction between the user and your bot, you define one or more intents. For example, for a pizza ordering bot you would create an OrderPizza intent. When you create an intent, you must provide a name. You can optionally provide the following:   Sample utterances. For example, "I want to order a pizza" and "Can I order a pizza." You can't provide utterances for built-in intents.   Information to be gathered. You specify slots for the information that you bot requests from the user. You can specify standard slot types, such as date and time, or custom slot types for your application.   How the intent is fulfilled. You can provide a Lambda function or configure the intent to return the intent information to your client application. If you use a Lambda function, Amazon Lex invokes the function when all of the intent information is available.   A confirmation prompt to send to the user to confirm an intent. For example, "Shall I order your pizza?"   A conclusion statement to send to the user after the intent is fulfilled. For example, "I ordered your pizza."   A follow-up prompt that asks the user for additional activity. For example, "Do you want a drink with your pizza?"  
    */
  def createIntent(): Request[CreateIntentResponse, AWSError] = js.native
  def createIntent(callback: js.Function2[/* err */ AWSError, /* data */ CreateIntentResponse, Unit]): Request[CreateIntentResponse, AWSError] = js.native
  /**
    * Creates an intent. To define the interaction between the user and your bot, you define one or more intents. For example, for a pizza ordering bot you would create an OrderPizza intent. When you create an intent, you must provide a name. You can optionally provide the following:   Sample utterances. For example, "I want to order a pizza" and "Can I order a pizza." You can't provide utterances for built-in intents.   Information to be gathered. You specify slots for the information that you bot requests from the user. You can specify standard slot types, such as date and time, or custom slot types for your application.   How the intent is fulfilled. You can provide a Lambda function or configure the intent to return the intent information to your client application. If you use a Lambda function, Amazon Lex invokes the function when all of the intent information is available.   A confirmation prompt to send to the user to confirm an intent. For example, "Shall I order your pizza?"   A conclusion statement to send to the user after the intent is fulfilled. For example, "I ordered your pizza."   A follow-up prompt that asks the user for additional activity. For example, "Do you want a drink with your pizza?"  
    */
  def createIntent(params: CreateIntentRequest): Request[CreateIntentResponse, AWSError] = js.native
  def createIntent(
    params: CreateIntentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateIntentResponse, Unit]
  ): Request[CreateIntentResponse, AWSError] = js.native
  
  /**
    * Creates a new resource policy with the specified policy statements.
    */
  def createResourcePolicy(): Request[CreateResourcePolicyResponse, AWSError] = js.native
  def createResourcePolicy(callback: js.Function2[/* err */ AWSError, /* data */ CreateResourcePolicyResponse, Unit]): Request[CreateResourcePolicyResponse, AWSError] = js.native
  /**
    * Creates a new resource policy with the specified policy statements.
    */
  def createResourcePolicy(params: CreateResourcePolicyRequest): Request[CreateResourcePolicyResponse, AWSError] = js.native
  def createResourcePolicy(
    params: CreateResourcePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateResourcePolicyResponse, Unit]
  ): Request[CreateResourcePolicyResponse, AWSError] = js.native
  
  /**
    * Adds a new resource policy statement to a bot or bot alias. If a resource policy exists, the statement is added to the current resource policy. If a policy doesn't exist, a new policy is created. You can't create a resource policy statement that allows cross-account access.
    */
  def createResourcePolicyStatement(): Request[CreateResourcePolicyStatementResponse, AWSError] = js.native
  def createResourcePolicyStatement(callback: js.Function2[/* err */ AWSError, /* data */ CreateResourcePolicyStatementResponse, Unit]): Request[CreateResourcePolicyStatementResponse, AWSError] = js.native
  /**
    * Adds a new resource policy statement to a bot or bot alias. If a resource policy exists, the statement is added to the current resource policy. If a policy doesn't exist, a new policy is created. You can't create a resource policy statement that allows cross-account access.
    */
  def createResourcePolicyStatement(params: CreateResourcePolicyStatementRequest): Request[CreateResourcePolicyStatementResponse, AWSError] = js.native
  def createResourcePolicyStatement(
    params: CreateResourcePolicyStatementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateResourcePolicyStatementResponse, Unit]
  ): Request[CreateResourcePolicyStatementResponse, AWSError] = js.native
  
  /**
    * Creates a slot in an intent. A slot is a variable needed to fulfill an intent. For example, an OrderPizza intent might need slots for size, crust, and number of pizzas. For each slot, you define one or more utterances that Amazon Lex uses to elicit a response from the user. 
    */
  def createSlot(): Request[CreateSlotResponse, AWSError] = js.native
  def createSlot(callback: js.Function2[/* err */ AWSError, /* data */ CreateSlotResponse, Unit]): Request[CreateSlotResponse, AWSError] = js.native
  /**
    * Creates a slot in an intent. A slot is a variable needed to fulfill an intent. For example, an OrderPizza intent might need slots for size, crust, and number of pizzas. For each slot, you define one or more utterances that Amazon Lex uses to elicit a response from the user. 
    */
  def createSlot(params: CreateSlotRequest): Request[CreateSlotResponse, AWSError] = js.native
  def createSlot(
    params: CreateSlotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSlotResponse, Unit]
  ): Request[CreateSlotResponse, AWSError] = js.native
  
  /**
    * Creates a custom slot type  To create a custom slot type, specify a name for the slot type and a set of enumeration values, the values that a slot of this type can assume. 
    */
  def createSlotType(): Request[CreateSlotTypeResponse, AWSError] = js.native
  def createSlotType(callback: js.Function2[/* err */ AWSError, /* data */ CreateSlotTypeResponse, Unit]): Request[CreateSlotTypeResponse, AWSError] = js.native
  /**
    * Creates a custom slot type  To create a custom slot type, specify a name for the slot type and a set of enumeration values, the values that a slot of this type can assume. 
    */
  def createSlotType(params: CreateSlotTypeRequest): Request[CreateSlotTypeResponse, AWSError] = js.native
  def createSlotType(
    params: CreateSlotTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSlotTypeResponse, Unit]
  ): Request[CreateSlotTypeResponse, AWSError] = js.native
  
  /**
    * Gets a pre-signed S3 write URL that you use to upload the zip archive when importing a bot or a bot locale. 
    */
  def createUploadUrl(): Request[CreateUploadUrlResponse, AWSError] = js.native
  def createUploadUrl(callback: js.Function2[/* err */ AWSError, /* data */ CreateUploadUrlResponse, Unit]): Request[CreateUploadUrlResponse, AWSError] = js.native
  /**
    * Gets a pre-signed S3 write URL that you use to upload the zip archive when importing a bot or a bot locale. 
    */
  def createUploadUrl(params: CreateUploadUrlRequest): Request[CreateUploadUrlResponse, AWSError] = js.native
  def createUploadUrl(
    params: CreateUploadUrlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUploadUrlResponse, Unit]
  ): Request[CreateUploadUrlResponse, AWSError] = js.native
  
  /**
    * Deletes all versions of a bot, including the Draft version. To delete a specific version, use the DeleteBotVersion operation. When you delete a bot, all of the resources contained in the bot are also deleted. Deleting a bot removes all locales, intents, slot, and slot types defined for the bot. If a bot has an alias, the DeleteBot operation returns a ResourceInUseException exception. If you want to delete the bot and the alias, set the skipResourceInUseCheck parameter to true.
    */
  def deleteBot(): Request[DeleteBotResponse, AWSError] = js.native
  def deleteBot(callback: js.Function2[/* err */ AWSError, /* data */ DeleteBotResponse, Unit]): Request[DeleteBotResponse, AWSError] = js.native
  /**
    * Deletes all versions of a bot, including the Draft version. To delete a specific version, use the DeleteBotVersion operation. When you delete a bot, all of the resources contained in the bot are also deleted. Deleting a bot removes all locales, intents, slot, and slot types defined for the bot. If a bot has an alias, the DeleteBot operation returns a ResourceInUseException exception. If you want to delete the bot and the alias, set the skipResourceInUseCheck parameter to true.
    */
  def deleteBot(params: DeleteBotRequest): Request[DeleteBotResponse, AWSError] = js.native
  def deleteBot(
    params: DeleteBotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteBotResponse, Unit]
  ): Request[DeleteBotResponse, AWSError] = js.native
  
  /**
    * Deletes the specified bot alias.
    */
  def deleteBotAlias(): Request[DeleteBotAliasResponse, AWSError] = js.native
  def deleteBotAlias(callback: js.Function2[/* err */ AWSError, /* data */ DeleteBotAliasResponse, Unit]): Request[DeleteBotAliasResponse, AWSError] = js.native
  /**
    * Deletes the specified bot alias.
    */
  def deleteBotAlias(params: DeleteBotAliasRequest): Request[DeleteBotAliasResponse, AWSError] = js.native
  def deleteBotAlias(
    params: DeleteBotAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteBotAliasResponse, Unit]
  ): Request[DeleteBotAliasResponse, AWSError] = js.native
  
  /**
    * Removes a locale from a bot. When you delete a locale, all intents, slots, and slot types defined for the locale are also deleted.
    */
  def deleteBotLocale(): Request[DeleteBotLocaleResponse, AWSError] = js.native
  def deleteBotLocale(callback: js.Function2[/* err */ AWSError, /* data */ DeleteBotLocaleResponse, Unit]): Request[DeleteBotLocaleResponse, AWSError] = js.native
  /**
    * Removes a locale from a bot. When you delete a locale, all intents, slots, and slot types defined for the locale are also deleted.
    */
  def deleteBotLocale(params: DeleteBotLocaleRequest): Request[DeleteBotLocaleResponse, AWSError] = js.native
  def deleteBotLocale(
    params: DeleteBotLocaleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteBotLocaleResponse, Unit]
  ): Request[DeleteBotLocaleResponse, AWSError] = js.native
  
  /**
    * Deletes a specific version of a bot. To delete all version of a bot, use the DeleteBot operation.
    */
  def deleteBotVersion(): Request[DeleteBotVersionResponse, AWSError] = js.native
  def deleteBotVersion(callback: js.Function2[/* err */ AWSError, /* data */ DeleteBotVersionResponse, Unit]): Request[DeleteBotVersionResponse, AWSError] = js.native
  /**
    * Deletes a specific version of a bot. To delete all version of a bot, use the DeleteBot operation.
    */
  def deleteBotVersion(params: DeleteBotVersionRequest): Request[DeleteBotVersionResponse, AWSError] = js.native
  def deleteBotVersion(
    params: DeleteBotVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteBotVersionResponse, Unit]
  ): Request[DeleteBotVersionResponse, AWSError] = js.native
  
  /**
    * Removes a custom vocabulary from the specified locale in the specified bot.
    */
  def deleteCustomVocabulary(): Request[DeleteCustomVocabularyResponse, AWSError] = js.native
  def deleteCustomVocabulary(callback: js.Function2[/* err */ AWSError, /* data */ DeleteCustomVocabularyResponse, Unit]): Request[DeleteCustomVocabularyResponse, AWSError] = js.native
  /**
    * Removes a custom vocabulary from the specified locale in the specified bot.
    */
  def deleteCustomVocabulary(params: DeleteCustomVocabularyRequest): Request[DeleteCustomVocabularyResponse, AWSError] = js.native
  def deleteCustomVocabulary(
    params: DeleteCustomVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCustomVocabularyResponse, Unit]
  ): Request[DeleteCustomVocabularyResponse, AWSError] = js.native
  
  /**
    * Removes a previous export and the associated files stored in an S3 bucket.
    */
  def deleteExport(): Request[DeleteExportResponse, AWSError] = js.native
  def deleteExport(callback: js.Function2[/* err */ AWSError, /* data */ DeleteExportResponse, Unit]): Request[DeleteExportResponse, AWSError] = js.native
  /**
    * Removes a previous export and the associated files stored in an S3 bucket.
    */
  def deleteExport(params: DeleteExportRequest): Request[DeleteExportResponse, AWSError] = js.native
  def deleteExport(
    params: DeleteExportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteExportResponse, Unit]
  ): Request[DeleteExportResponse, AWSError] = js.native
  
  /**
    * Removes a previous import and the associated file stored in an S3 bucket.
    */
  def deleteImport(): Request[DeleteImportResponse, AWSError] = js.native
  def deleteImport(callback: js.Function2[/* err */ AWSError, /* data */ DeleteImportResponse, Unit]): Request[DeleteImportResponse, AWSError] = js.native
  /**
    * Removes a previous import and the associated file stored in an S3 bucket.
    */
  def deleteImport(params: DeleteImportRequest): Request[DeleteImportResponse, AWSError] = js.native
  def deleteImport(
    params: DeleteImportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteImportResponse, Unit]
  ): Request[DeleteImportResponse, AWSError] = js.native
  
  /**
    * Removes the specified intent. Deleting an intent also deletes the slots associated with the intent.
    */
  def deleteIntent(): Request[js.Object, AWSError] = js.native
  def deleteIntent(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the specified intent. Deleting an intent also deletes the slots associated with the intent.
    */
  def deleteIntent(params: DeleteIntentRequest): Request[js.Object, AWSError] = js.native
  def deleteIntent(
    params: DeleteIntentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes an existing policy from a bot or bot alias. If the resource doesn't have a policy attached, Amazon Lex returns an exception.
    */
  def deleteResourcePolicy(): Request[DeleteResourcePolicyResponse, AWSError] = js.native
  def deleteResourcePolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourcePolicyResponse, Unit]): Request[DeleteResourcePolicyResponse, AWSError] = js.native
  /**
    * Removes an existing policy from a bot or bot alias. If the resource doesn't have a policy attached, Amazon Lex returns an exception.
    */
  def deleteResourcePolicy(params: DeleteResourcePolicyRequest): Request[DeleteResourcePolicyResponse, AWSError] = js.native
  def deleteResourcePolicy(
    params: DeleteResourcePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourcePolicyResponse, Unit]
  ): Request[DeleteResourcePolicyResponse, AWSError] = js.native
  
  /**
    * Deletes a policy statement from a resource policy. If you delete the last statement from a policy, the policy is deleted. If you specify a statement ID that doesn't exist in the policy, or if the bot or bot alias doesn't have a policy attached, Amazon Lex returns an exception.
    */
  def deleteResourcePolicyStatement(): Request[DeleteResourcePolicyStatementResponse, AWSError] = js.native
  def deleteResourcePolicyStatement(callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourcePolicyStatementResponse, Unit]): Request[DeleteResourcePolicyStatementResponse, AWSError] = js.native
  /**
    * Deletes a policy statement from a resource policy. If you delete the last statement from a policy, the policy is deleted. If you specify a statement ID that doesn't exist in the policy, or if the bot or bot alias doesn't have a policy attached, Amazon Lex returns an exception.
    */
  def deleteResourcePolicyStatement(params: DeleteResourcePolicyStatementRequest): Request[DeleteResourcePolicyStatementResponse, AWSError] = js.native
  def deleteResourcePolicyStatement(
    params: DeleteResourcePolicyStatementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteResourcePolicyStatementResponse, Unit]
  ): Request[DeleteResourcePolicyStatementResponse, AWSError] = js.native
  
  /**
    * Deletes the specified slot from an intent.
    */
  def deleteSlot(): Request[js.Object, AWSError] = js.native
  def deleteSlot(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified slot from an intent.
    */
  def deleteSlot(params: DeleteSlotRequest): Request[js.Object, AWSError] = js.native
  def deleteSlot(params: DeleteSlotRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a slot type from a bot locale. If a slot is using the slot type, Amazon Lex throws a ResourceInUseException exception. To avoid the exception, set the skipResourceInUseCheck parameter to true.
    */
  def deleteSlotType(): Request[js.Object, AWSError] = js.native
  def deleteSlotType(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a slot type from a bot locale. If a slot is using the slot type, Amazon Lex throws a ResourceInUseException exception. To avoid the exception, set the skipResourceInUseCheck parameter to true.
    */
  def deleteSlotType(params: DeleteSlotTypeRequest): Request[js.Object, AWSError] = js.native
  def deleteSlotType(
    params: DeleteSlotTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes stored utterances. Amazon Lex stores the utterances that users send to your bot. Utterances are stored for 15 days for use with the ListAggregatedUtterances operation, and then stored indefinitely for use in improving the ability of your bot to respond to user input.. Use the DeleteUtterances operation to manually delete utterances for a specific session. When you use the DeleteUtterances operation, utterances stored for improving your bot's ability to respond to user input are deleted immediately. Utterances stored for use with the ListAggregatedUtterances operation are deleted after 15 days.
    */
  def deleteUtterances(): Request[DeleteUtterancesResponse, AWSError] = js.native
  def deleteUtterances(callback: js.Function2[/* err */ AWSError, /* data */ DeleteUtterancesResponse, Unit]): Request[DeleteUtterancesResponse, AWSError] = js.native
  /**
    * Deletes stored utterances. Amazon Lex stores the utterances that users send to your bot. Utterances are stored for 15 days for use with the ListAggregatedUtterances operation, and then stored indefinitely for use in improving the ability of your bot to respond to user input.. Use the DeleteUtterances operation to manually delete utterances for a specific session. When you use the DeleteUtterances operation, utterances stored for improving your bot's ability to respond to user input are deleted immediately. Utterances stored for use with the ListAggregatedUtterances operation are deleted after 15 days.
    */
  def deleteUtterances(params: DeleteUtterancesRequest): Request[DeleteUtterancesResponse, AWSError] = js.native
  def deleteUtterances(
    params: DeleteUtterancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteUtterancesResponse, Unit]
  ): Request[DeleteUtterancesResponse, AWSError] = js.native
  
  /**
    * Provides metadata information about a bot. 
    */
  def describeBot(): Request[DescribeBotResponse, AWSError] = js.native
  def describeBot(callback: js.Function2[/* err */ AWSError, /* data */ DescribeBotResponse, Unit]): Request[DescribeBotResponse, AWSError] = js.native
  /**
    * Provides metadata information about a bot. 
    */
  def describeBot(params: DescribeBotRequest): Request[DescribeBotResponse, AWSError] = js.native
  def describeBot(
    params: DescribeBotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBotResponse, Unit]
  ): Request[DescribeBotResponse, AWSError] = js.native
  
  /**
    * Get information about a specific bot alias.
    */
  def describeBotAlias(): Request[DescribeBotAliasResponse, AWSError] = js.native
  def describeBotAlias(callback: js.Function2[/* err */ AWSError, /* data */ DescribeBotAliasResponse, Unit]): Request[DescribeBotAliasResponse, AWSError] = js.native
  /**
    * Get information about a specific bot alias.
    */
  def describeBotAlias(params: DescribeBotAliasRequest): Request[DescribeBotAliasResponse, AWSError] = js.native
  def describeBotAlias(
    params: DescribeBotAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBotAliasResponse, Unit]
  ): Request[DescribeBotAliasResponse, AWSError] = js.native
  
  /**
    * Describes the settings that a bot has for a specific locale. 
    */
  def describeBotLocale(): Request[DescribeBotLocaleResponse, AWSError] = js.native
  def describeBotLocale(callback: js.Function2[/* err */ AWSError, /* data */ DescribeBotLocaleResponse, Unit]): Request[DescribeBotLocaleResponse, AWSError] = js.native
  /**
    * Describes the settings that a bot has for a specific locale. 
    */
  def describeBotLocale(params: DescribeBotLocaleRequest): Request[DescribeBotLocaleResponse, AWSError] = js.native
  def describeBotLocale(
    params: DescribeBotLocaleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBotLocaleResponse, Unit]
  ): Request[DescribeBotLocaleResponse, AWSError] = js.native
  
  /**
    * Provides metadata information about a bot recommendation. This information will enable you to get a description on the request inputs, to download associated transcripts after processing is complete, and to download intents and slot-types generated by the bot recommendation.
    */
  def describeBotRecommendation(): Request[DescribeBotRecommendationResponse, AWSError] = js.native
  def describeBotRecommendation(callback: js.Function2[/* err */ AWSError, /* data */ DescribeBotRecommendationResponse, Unit]): Request[DescribeBotRecommendationResponse, AWSError] = js.native
  /**
    * Provides metadata information about a bot recommendation. This information will enable you to get a description on the request inputs, to download associated transcripts after processing is complete, and to download intents and slot-types generated by the bot recommendation.
    */
  def describeBotRecommendation(params: DescribeBotRecommendationRequest): Request[DescribeBotRecommendationResponse, AWSError] = js.native
  def describeBotRecommendation(
    params: DescribeBotRecommendationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBotRecommendationResponse, Unit]
  ): Request[DescribeBotRecommendationResponse, AWSError] = js.native
  
  /**
    * Provides metadata about a version of a bot.
    */
  def describeBotVersion(): Request[DescribeBotVersionResponse, AWSError] = js.native
  def describeBotVersion(callback: js.Function2[/* err */ AWSError, /* data */ DescribeBotVersionResponse, Unit]): Request[DescribeBotVersionResponse, AWSError] = js.native
  /**
    * Provides metadata about a version of a bot.
    */
  def describeBotVersion(params: DescribeBotVersionRequest): Request[DescribeBotVersionResponse, AWSError] = js.native
  def describeBotVersion(
    params: DescribeBotVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBotVersionResponse, Unit]
  ): Request[DescribeBotVersionResponse, AWSError] = js.native
  
  /**
    * Provides metadata information about a custom vocabulary.
    */
  def describeCustomVocabularyMetadata(): Request[DescribeCustomVocabularyMetadataResponse, AWSError] = js.native
  def describeCustomVocabularyMetadata(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCustomVocabularyMetadataResponse, Unit]
  ): Request[DescribeCustomVocabularyMetadataResponse, AWSError] = js.native
  /**
    * Provides metadata information about a custom vocabulary.
    */
  def describeCustomVocabularyMetadata(params: DescribeCustomVocabularyMetadataRequest): Request[DescribeCustomVocabularyMetadataResponse, AWSError] = js.native
  def describeCustomVocabularyMetadata(
    params: DescribeCustomVocabularyMetadataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCustomVocabularyMetadataResponse, Unit]
  ): Request[DescribeCustomVocabularyMetadataResponse, AWSError] = js.native
  
  /**
    * Gets information about a specific export.
    */
  def describeExport(): Request[DescribeExportResponse, AWSError] = js.native
  def describeExport(callback: js.Function2[/* err */ AWSError, /* data */ DescribeExportResponse, Unit]): Request[DescribeExportResponse, AWSError] = js.native
  /**
    * Gets information about a specific export.
    */
  def describeExport(params: DescribeExportRequest): Request[DescribeExportResponse, AWSError] = js.native
  def describeExport(
    params: DescribeExportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeExportResponse, Unit]
  ): Request[DescribeExportResponse, AWSError] = js.native
  
  /**
    * Gets information about a specific import.
    */
  def describeImport(): Request[DescribeImportResponse, AWSError] = js.native
  def describeImport(callback: js.Function2[/* err */ AWSError, /* data */ DescribeImportResponse, Unit]): Request[DescribeImportResponse, AWSError] = js.native
  /**
    * Gets information about a specific import.
    */
  def describeImport(params: DescribeImportRequest): Request[DescribeImportResponse, AWSError] = js.native
  def describeImport(
    params: DescribeImportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImportResponse, Unit]
  ): Request[DescribeImportResponse, AWSError] = js.native
  
  /**
    * Returns metadata about an intent.
    */
  def describeIntent(): Request[DescribeIntentResponse, AWSError] = js.native
  def describeIntent(callback: js.Function2[/* err */ AWSError, /* data */ DescribeIntentResponse, Unit]): Request[DescribeIntentResponse, AWSError] = js.native
  /**
    * Returns metadata about an intent.
    */
  def describeIntent(params: DescribeIntentRequest): Request[DescribeIntentResponse, AWSError] = js.native
  def describeIntent(
    params: DescribeIntentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeIntentResponse, Unit]
  ): Request[DescribeIntentResponse, AWSError] = js.native
  
  /**
    * Gets the resource policy and policy revision for a bot or bot alias.
    */
  def describeResourcePolicy(): Request[DescribeResourcePolicyResponse, AWSError] = js.native
  def describeResourcePolicy(callback: js.Function2[/* err */ AWSError, /* data */ DescribeResourcePolicyResponse, Unit]): Request[DescribeResourcePolicyResponse, AWSError] = js.native
  /**
    * Gets the resource policy and policy revision for a bot or bot alias.
    */
  def describeResourcePolicy(params: DescribeResourcePolicyRequest): Request[DescribeResourcePolicyResponse, AWSError] = js.native
  def describeResourcePolicy(
    params: DescribeResourcePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeResourcePolicyResponse, Unit]
  ): Request[DescribeResourcePolicyResponse, AWSError] = js.native
  
  /**
    * Gets metadata information about a slot.
    */
  def describeSlot(): Request[DescribeSlotResponse, AWSError] = js.native
  def describeSlot(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSlotResponse, Unit]): Request[DescribeSlotResponse, AWSError] = js.native
  /**
    * Gets metadata information about a slot.
    */
  def describeSlot(params: DescribeSlotRequest): Request[DescribeSlotResponse, AWSError] = js.native
  def describeSlot(
    params: DescribeSlotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSlotResponse, Unit]
  ): Request[DescribeSlotResponse, AWSError] = js.native
  
  /**
    * Gets metadata information about a slot type.
    */
  def describeSlotType(): Request[DescribeSlotTypeResponse, AWSError] = js.native
  def describeSlotType(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSlotTypeResponse, Unit]): Request[DescribeSlotTypeResponse, AWSError] = js.native
  /**
    * Gets metadata information about a slot type.
    */
  def describeSlotType(params: DescribeSlotTypeRequest): Request[DescribeSlotTypeResponse, AWSError] = js.native
  def describeSlotType(
    params: DescribeSlotTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSlotTypeResponse, Unit]
  ): Request[DescribeSlotTypeResponse, AWSError] = js.native
  
  /**
    * Provides a list of utterances that users have sent to the bot. Utterances are aggregated by the text of the utterance. For example, all instances where customers used the phrase "I want to order pizza" are aggregated into the same line in the response. You can see both detected utterances and missed utterances. A detected utterance is where the bot properly recognized the utterance and activated the associated intent. A missed utterance was not recognized by the bot and didn't activate an intent. Utterances can be aggregated for a bot alias or for a bot version, but not both at the same time. Utterances statistics are not generated under the following conditions:   The childDirected field was set to true when the bot was created.   You are using slot obfuscation with one or more slots.   You opted out of participating in improving Amazon Lex.  
    */
  def listAggregatedUtterances(): Request[ListAggregatedUtterancesResponse, AWSError] = js.native
  def listAggregatedUtterances(callback: js.Function2[/* err */ AWSError, /* data */ ListAggregatedUtterancesResponse, Unit]): Request[ListAggregatedUtterancesResponse, AWSError] = js.native
  /**
    * Provides a list of utterances that users have sent to the bot. Utterances are aggregated by the text of the utterance. For example, all instances where customers used the phrase "I want to order pizza" are aggregated into the same line in the response. You can see both detected utterances and missed utterances. A detected utterance is where the bot properly recognized the utterance and activated the associated intent. A missed utterance was not recognized by the bot and didn't activate an intent. Utterances can be aggregated for a bot alias or for a bot version, but not both at the same time. Utterances statistics are not generated under the following conditions:   The childDirected field was set to true when the bot was created.   You are using slot obfuscation with one or more slots.   You opted out of participating in improving Amazon Lex.  
    */
  def listAggregatedUtterances(params: ListAggregatedUtterancesRequest): Request[ListAggregatedUtterancesResponse, AWSError] = js.native
  def listAggregatedUtterances(
    params: ListAggregatedUtterancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAggregatedUtterancesResponse, Unit]
  ): Request[ListAggregatedUtterancesResponse, AWSError] = js.native
  
  /**
    * Gets a list of aliases for the specified bot.
    */
  def listBotAliases(): Request[ListBotAliasesResponse, AWSError] = js.native
  def listBotAliases(callback: js.Function2[/* err */ AWSError, /* data */ ListBotAliasesResponse, Unit]): Request[ListBotAliasesResponse, AWSError] = js.native
  /**
    * Gets a list of aliases for the specified bot.
    */
  def listBotAliases(params: ListBotAliasesRequest): Request[ListBotAliasesResponse, AWSError] = js.native
  def listBotAliases(
    params: ListBotAliasesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBotAliasesResponse, Unit]
  ): Request[ListBotAliasesResponse, AWSError] = js.native
  
  /**
    * Gets a list of locales for the specified bot.
    */
  def listBotLocales(): Request[ListBotLocalesResponse, AWSError] = js.native
  def listBotLocales(callback: js.Function2[/* err */ AWSError, /* data */ ListBotLocalesResponse, Unit]): Request[ListBotLocalesResponse, AWSError] = js.native
  /**
    * Gets a list of locales for the specified bot.
    */
  def listBotLocales(params: ListBotLocalesRequest): Request[ListBotLocalesResponse, AWSError] = js.native
  def listBotLocales(
    params: ListBotLocalesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBotLocalesResponse, Unit]
  ): Request[ListBotLocalesResponse, AWSError] = js.native
  
  /**
    * Get a list of bot recommendations that meet the specified criteria.
    */
  def listBotRecommendations(): Request[ListBotRecommendationsResponse, AWSError] = js.native
  def listBotRecommendations(callback: js.Function2[/* err */ AWSError, /* data */ ListBotRecommendationsResponse, Unit]): Request[ListBotRecommendationsResponse, AWSError] = js.native
  /**
    * Get a list of bot recommendations that meet the specified criteria.
    */
  def listBotRecommendations(params: ListBotRecommendationsRequest): Request[ListBotRecommendationsResponse, AWSError] = js.native
  def listBotRecommendations(
    params: ListBotRecommendationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBotRecommendationsResponse, Unit]
  ): Request[ListBotRecommendationsResponse, AWSError] = js.native
  
  /**
    * Gets information about all of the versions of a bot. The ListBotVersions operation returns a summary of each version of a bot. For example, if a bot has three numbered versions, the ListBotVersions operation returns for summaries, one for each numbered version and one for the DRAFT version. The ListBotVersions operation always returns at least one version, the DRAFT version.
    */
  def listBotVersions(): Request[ListBotVersionsResponse, AWSError] = js.native
  def listBotVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListBotVersionsResponse, Unit]): Request[ListBotVersionsResponse, AWSError] = js.native
  /**
    * Gets information about all of the versions of a bot. The ListBotVersions operation returns a summary of each version of a bot. For example, if a bot has three numbered versions, the ListBotVersions operation returns for summaries, one for each numbered version and one for the DRAFT version. The ListBotVersions operation always returns at least one version, the DRAFT version.
    */
  def listBotVersions(params: ListBotVersionsRequest): Request[ListBotVersionsResponse, AWSError] = js.native
  def listBotVersions(
    params: ListBotVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBotVersionsResponse, Unit]
  ): Request[ListBotVersionsResponse, AWSError] = js.native
  
  /**
    * Gets a list of available bots.
    */
  def listBots(): Request[ListBotsResponse, AWSError] = js.native
  def listBots(callback: js.Function2[/* err */ AWSError, /* data */ ListBotsResponse, Unit]): Request[ListBotsResponse, AWSError] = js.native
  /**
    * Gets a list of available bots.
    */
  def listBots(params: ListBotsRequest): Request[ListBotsResponse, AWSError] = js.native
  def listBots(
    params: ListBotsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBotsResponse, Unit]
  ): Request[ListBotsResponse, AWSError] = js.native
  
  /**
    * Gets a list of built-in intents provided by Amazon Lex that you can use in your bot.  To use a built-in intent as a the base for your own intent, include the built-in intent signature in the parentIntentSignature parameter when you call the CreateIntent operation. For more information, see CreateIntent.
    */
  def listBuiltInIntents(): Request[ListBuiltInIntentsResponse, AWSError] = js.native
  def listBuiltInIntents(callback: js.Function2[/* err */ AWSError, /* data */ ListBuiltInIntentsResponse, Unit]): Request[ListBuiltInIntentsResponse, AWSError] = js.native
  /**
    * Gets a list of built-in intents provided by Amazon Lex that you can use in your bot.  To use a built-in intent as a the base for your own intent, include the built-in intent signature in the parentIntentSignature parameter when you call the CreateIntent operation. For more information, see CreateIntent.
    */
  def listBuiltInIntents(params: ListBuiltInIntentsRequest): Request[ListBuiltInIntentsResponse, AWSError] = js.native
  def listBuiltInIntents(
    params: ListBuiltInIntentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBuiltInIntentsResponse, Unit]
  ): Request[ListBuiltInIntentsResponse, AWSError] = js.native
  
  /**
    * Gets a list of built-in slot types that meet the specified criteria.
    */
  def listBuiltInSlotTypes(): Request[ListBuiltInSlotTypesResponse, AWSError] = js.native
  def listBuiltInSlotTypes(callback: js.Function2[/* err */ AWSError, /* data */ ListBuiltInSlotTypesResponse, Unit]): Request[ListBuiltInSlotTypesResponse, AWSError] = js.native
  /**
    * Gets a list of built-in slot types that meet the specified criteria.
    */
  def listBuiltInSlotTypes(params: ListBuiltInSlotTypesRequest): Request[ListBuiltInSlotTypesResponse, AWSError] = js.native
  def listBuiltInSlotTypes(
    params: ListBuiltInSlotTypesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBuiltInSlotTypesResponse, Unit]
  ): Request[ListBuiltInSlotTypesResponse, AWSError] = js.native
  
  /**
    * List custom vocabulary items for the specified locale in the specified bot.
    */
  def listCustomVocabularyItems(): Request[ListCustomVocabularyItemsResponse, AWSError] = js.native
  def listCustomVocabularyItems(callback: js.Function2[/* err */ AWSError, /* data */ ListCustomVocabularyItemsResponse, Unit]): Request[ListCustomVocabularyItemsResponse, AWSError] = js.native
  /**
    * List custom vocabulary items for the specified locale in the specified bot.
    */
  def listCustomVocabularyItems(params: ListCustomVocabularyItemsRequest): Request[ListCustomVocabularyItemsResponse, AWSError] = js.native
  def listCustomVocabularyItems(
    params: ListCustomVocabularyItemsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCustomVocabularyItemsResponse, Unit]
  ): Request[ListCustomVocabularyItemsResponse, AWSError] = js.native
  
  /**
    * Lists the exports for a bot, bot locale, or custom vocabulary. Exports are kept in the list for 7 days.
    */
  def listExports(): Request[ListExportsResponse, AWSError] = js.native
  def listExports(callback: js.Function2[/* err */ AWSError, /* data */ ListExportsResponse, Unit]): Request[ListExportsResponse, AWSError] = js.native
  /**
    * Lists the exports for a bot, bot locale, or custom vocabulary. Exports are kept in the list for 7 days.
    */
  def listExports(params: ListExportsRequest): Request[ListExportsResponse, AWSError] = js.native
  def listExports(
    params: ListExportsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListExportsResponse, Unit]
  ): Request[ListExportsResponse, AWSError] = js.native
  
  /**
    * Lists the imports for a bot, bot locale, or custom vocabulary. Imports are kept in the list for 7 days.
    */
  def listImports(): Request[ListImportsResponse, AWSError] = js.native
  def listImports(callback: js.Function2[/* err */ AWSError, /* data */ ListImportsResponse, Unit]): Request[ListImportsResponse, AWSError] = js.native
  /**
    * Lists the imports for a bot, bot locale, or custom vocabulary. Imports are kept in the list for 7 days.
    */
  def listImports(params: ListImportsRequest): Request[ListImportsResponse, AWSError] = js.native
  def listImports(
    params: ListImportsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListImportsResponse, Unit]
  ): Request[ListImportsResponse, AWSError] = js.native
  
  /**
    * Get a list of intents that meet the specified criteria.
    */
  def listIntents(): Request[ListIntentsResponse, AWSError] = js.native
  def listIntents(callback: js.Function2[/* err */ AWSError, /* data */ ListIntentsResponse, Unit]): Request[ListIntentsResponse, AWSError] = js.native
  /**
    * Get a list of intents that meet the specified criteria.
    */
  def listIntents(params: ListIntentsRequest): Request[ListIntentsResponse, AWSError] = js.native
  def listIntents(
    params: ListIntentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIntentsResponse, Unit]
  ): Request[ListIntentsResponse, AWSError] = js.native
  
  /**
    * Gets a list of recommended intents provided by the bot recommendation that you can use in your bot. Intents in the response are ordered by relevance.
    */
  def listRecommendedIntents(): Request[ListRecommendedIntentsResponse, AWSError] = js.native
  def listRecommendedIntents(callback: js.Function2[/* err */ AWSError, /* data */ ListRecommendedIntentsResponse, Unit]): Request[ListRecommendedIntentsResponse, AWSError] = js.native
  /**
    * Gets a list of recommended intents provided by the bot recommendation that you can use in your bot. Intents in the response are ordered by relevance.
    */
  def listRecommendedIntents(params: ListRecommendedIntentsRequest): Request[ListRecommendedIntentsResponse, AWSError] = js.native
  def listRecommendedIntents(
    params: ListRecommendedIntentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRecommendedIntentsResponse, Unit]
  ): Request[ListRecommendedIntentsResponse, AWSError] = js.native
  
  /**
    * Gets a list of slot types that match the specified criteria.
    */
  def listSlotTypes(): Request[ListSlotTypesResponse, AWSError] = js.native
  def listSlotTypes(callback: js.Function2[/* err */ AWSError, /* data */ ListSlotTypesResponse, Unit]): Request[ListSlotTypesResponse, AWSError] = js.native
  /**
    * Gets a list of slot types that match the specified criteria.
    */
  def listSlotTypes(params: ListSlotTypesRequest): Request[ListSlotTypesResponse, AWSError] = js.native
  def listSlotTypes(
    params: ListSlotTypesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSlotTypesResponse, Unit]
  ): Request[ListSlotTypesResponse, AWSError] = js.native
  
  /**
    * Gets a list of slots that match the specified criteria.
    */
  def listSlots(): Request[ListSlotsResponse, AWSError] = js.native
  def listSlots(callback: js.Function2[/* err */ AWSError, /* data */ ListSlotsResponse, Unit]): Request[ListSlotsResponse, AWSError] = js.native
  /**
    * Gets a list of slots that match the specified criteria.
    */
  def listSlots(params: ListSlotsRequest): Request[ListSlotsResponse, AWSError] = js.native
  def listSlots(
    params: ListSlotsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSlotsResponse, Unit]
  ): Request[ListSlotsResponse, AWSError] = js.native
  
  /**
    * Gets a list of tags associated with a resource. Only bots, bot aliases, and bot channels can have tags associated with them.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Gets a list of tags associated with a resource. Only bots, bot aliases, and bot channels can have tags associated with them.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Search for associated transcripts that meet the specified criteria.
    */
  def searchAssociatedTranscripts(): Request[SearchAssociatedTranscriptsResponse, AWSError] = js.native
  def searchAssociatedTranscripts(callback: js.Function2[/* err */ AWSError, /* data */ SearchAssociatedTranscriptsResponse, Unit]): Request[SearchAssociatedTranscriptsResponse, AWSError] = js.native
  /**
    * Search for associated transcripts that meet the specified criteria.
    */
  def searchAssociatedTranscripts(params: SearchAssociatedTranscriptsRequest): Request[SearchAssociatedTranscriptsResponse, AWSError] = js.native
  def searchAssociatedTranscripts(
    params: SearchAssociatedTranscriptsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchAssociatedTranscriptsResponse, Unit]
  ): Request[SearchAssociatedTranscriptsResponse, AWSError] = js.native
  
  /**
    * Use this to provide your transcript data, and to start the bot recommendation process.
    */
  def startBotRecommendation(): Request[StartBotRecommendationResponse, AWSError] = js.native
  def startBotRecommendation(callback: js.Function2[/* err */ AWSError, /* data */ StartBotRecommendationResponse, Unit]): Request[StartBotRecommendationResponse, AWSError] = js.native
  /**
    * Use this to provide your transcript data, and to start the bot recommendation process.
    */
  def startBotRecommendation(params: StartBotRecommendationRequest): Request[StartBotRecommendationResponse, AWSError] = js.native
  def startBotRecommendation(
    params: StartBotRecommendationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartBotRecommendationResponse, Unit]
  ): Request[StartBotRecommendationResponse, AWSError] = js.native
  
  /**
    * Starts importing a bot, bot locale, or custom vocabulary from a zip archive that you uploaded to an S3 bucket.
    */
  def startImport(): Request[StartImportResponse, AWSError] = js.native
  def startImport(callback: js.Function2[/* err */ AWSError, /* data */ StartImportResponse, Unit]): Request[StartImportResponse, AWSError] = js.native
  /**
    * Starts importing a bot, bot locale, or custom vocabulary from a zip archive that you uploaded to an S3 bucket.
    */
  def startImport(params: StartImportRequest): Request[StartImportResponse, AWSError] = js.native
  def startImport(
    params: StartImportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartImportResponse, Unit]
  ): Request[StartImportResponse, AWSError] = js.native
  
  /**
    * Stop an already running Bot Recommendation request.
    */
  def stopBotRecommendation(): Request[StopBotRecommendationResponse, AWSError] = js.native
  def stopBotRecommendation(callback: js.Function2[/* err */ AWSError, /* data */ StopBotRecommendationResponse, Unit]): Request[StopBotRecommendationResponse, AWSError] = js.native
  /**
    * Stop an already running Bot Recommendation request.
    */
  def stopBotRecommendation(params: StopBotRecommendationRequest): Request[StopBotRecommendationResponse, AWSError] = js.native
  def stopBotRecommendation(
    params: StopBotRecommendationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopBotRecommendationResponse, Unit]
  ): Request[StopBotRecommendationResponse, AWSError] = js.native
  
  /**
    * Adds the specified tags to the specified resource. If a tag key already exists, the existing value is replaced with the new value.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds the specified tags to the specified resource. If a tag key already exists, the existing value is replaced with the new value.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes tags from a bot, bot alias, or bot channel.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes tags from a bot, bot alias, or bot channel.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates the configuration of an existing bot. 
    */
  def updateBot(): Request[UpdateBotResponse, AWSError] = js.native
  def updateBot(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBotResponse, Unit]): Request[UpdateBotResponse, AWSError] = js.native
  /**
    * Updates the configuration of an existing bot. 
    */
  def updateBot(params: UpdateBotRequest): Request[UpdateBotResponse, AWSError] = js.native
  def updateBot(
    params: UpdateBotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBotResponse, Unit]
  ): Request[UpdateBotResponse, AWSError] = js.native
  
  /**
    * Updates the configuration of an existing bot alias.
    */
  def updateBotAlias(): Request[UpdateBotAliasResponse, AWSError] = js.native
  def updateBotAlias(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBotAliasResponse, Unit]): Request[UpdateBotAliasResponse, AWSError] = js.native
  /**
    * Updates the configuration of an existing bot alias.
    */
  def updateBotAlias(params: UpdateBotAliasRequest): Request[UpdateBotAliasResponse, AWSError] = js.native
  def updateBotAlias(
    params: UpdateBotAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBotAliasResponse, Unit]
  ): Request[UpdateBotAliasResponse, AWSError] = js.native
  
  /**
    * Updates the settings that a bot has for a specific locale.
    */
  def updateBotLocale(): Request[UpdateBotLocaleResponse, AWSError] = js.native
  def updateBotLocale(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBotLocaleResponse, Unit]): Request[UpdateBotLocaleResponse, AWSError] = js.native
  /**
    * Updates the settings that a bot has for a specific locale.
    */
  def updateBotLocale(params: UpdateBotLocaleRequest): Request[UpdateBotLocaleResponse, AWSError] = js.native
  def updateBotLocale(
    params: UpdateBotLocaleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBotLocaleResponse, Unit]
  ): Request[UpdateBotLocaleResponse, AWSError] = js.native
  
  /**
    * Updates an existing bot recommendation request.
    */
  def updateBotRecommendation(): Request[UpdateBotRecommendationResponse, AWSError] = js.native
  def updateBotRecommendation(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBotRecommendationResponse, Unit]): Request[UpdateBotRecommendationResponse, AWSError] = js.native
  /**
    * Updates an existing bot recommendation request.
    */
  def updateBotRecommendation(params: UpdateBotRecommendationRequest): Request[UpdateBotRecommendationResponse, AWSError] = js.native
  def updateBotRecommendation(
    params: UpdateBotRecommendationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBotRecommendationResponse, Unit]
  ): Request[UpdateBotRecommendationResponse, AWSError] = js.native
  
  /**
    * Updates the password used to protect an export zip archive. The password is not required. If you don't supply a password, Amazon Lex generates a zip file that is not protected by a password. This is the archive that is available at the pre-signed S3 URL provided by the DescribeExport operation.
    */
  def updateExport(): Request[UpdateExportResponse, AWSError] = js.native
  def updateExport(callback: js.Function2[/* err */ AWSError, /* data */ UpdateExportResponse, Unit]): Request[UpdateExportResponse, AWSError] = js.native
  /**
    * Updates the password used to protect an export zip archive. The password is not required. If you don't supply a password, Amazon Lex generates a zip file that is not protected by a password. This is the archive that is available at the pre-signed S3 URL provided by the DescribeExport operation.
    */
  def updateExport(params: UpdateExportRequest): Request[UpdateExportResponse, AWSError] = js.native
  def updateExport(
    params: UpdateExportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateExportResponse, Unit]
  ): Request[UpdateExportResponse, AWSError] = js.native
  
  /**
    * Updates the settings for an intent.
    */
  def updateIntent(): Request[UpdateIntentResponse, AWSError] = js.native
  def updateIntent(callback: js.Function2[/* err */ AWSError, /* data */ UpdateIntentResponse, Unit]): Request[UpdateIntentResponse, AWSError] = js.native
  /**
    * Updates the settings for an intent.
    */
  def updateIntent(params: UpdateIntentRequest): Request[UpdateIntentResponse, AWSError] = js.native
  def updateIntent(
    params: UpdateIntentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateIntentResponse, Unit]
  ): Request[UpdateIntentResponse, AWSError] = js.native
  
  /**
    * Replaces the existing resource policy for a bot or bot alias with a new one. If the policy doesn't exist, Amazon Lex returns an exception.
    */
  def updateResourcePolicy(): Request[UpdateResourcePolicyResponse, AWSError] = js.native
  def updateResourcePolicy(callback: js.Function2[/* err */ AWSError, /* data */ UpdateResourcePolicyResponse, Unit]): Request[UpdateResourcePolicyResponse, AWSError] = js.native
  /**
    * Replaces the existing resource policy for a bot or bot alias with a new one. If the policy doesn't exist, Amazon Lex returns an exception.
    */
  def updateResourcePolicy(params: UpdateResourcePolicyRequest): Request[UpdateResourcePolicyResponse, AWSError] = js.native
  def updateResourcePolicy(
    params: UpdateResourcePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateResourcePolicyResponse, Unit]
  ): Request[UpdateResourcePolicyResponse, AWSError] = js.native
  
  /**
    * Updates the settings for a slot.
    */
  def updateSlot(): Request[UpdateSlotResponse, AWSError] = js.native
  def updateSlot(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSlotResponse, Unit]): Request[UpdateSlotResponse, AWSError] = js.native
  /**
    * Updates the settings for a slot.
    */
  def updateSlot(params: UpdateSlotRequest): Request[UpdateSlotResponse, AWSError] = js.native
  def updateSlot(
    params: UpdateSlotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSlotResponse, Unit]
  ): Request[UpdateSlotResponse, AWSError] = js.native
  
  /**
    * Updates the configuration of an existing slot type.
    */
  def updateSlotType(): Request[UpdateSlotTypeResponse, AWSError] = js.native
  def updateSlotType(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSlotTypeResponse, Unit]): Request[UpdateSlotTypeResponse, AWSError] = js.native
  /**
    * Updates the configuration of an existing slot type.
    */
  def updateSlotType(params: UpdateSlotTypeRequest): Request[UpdateSlotTypeResponse, AWSError] = js.native
  def updateSlotType(
    params: UpdateSlotTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSlotTypeResponse, Unit]
  ): Request[UpdateSlotTypeResponse, AWSError] = js.native
}
